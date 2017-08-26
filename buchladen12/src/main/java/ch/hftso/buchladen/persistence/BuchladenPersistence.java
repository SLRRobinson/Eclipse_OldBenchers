package ch.hftso.buchladen.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

import ch.hftso.buchladen.model.Bestellung;
import ch.hftso.buchladen.model.Bestellposition;
import ch.hftso.buchladen.model.Buch;

/**
 * HFT-SO Modul 626
 * Aufbau eines einfachen Buchladens mit Servlets.
 * Datenbankzugriffe (ohne DAO).
 *
 * @author Ruedi Baumann
 * @version 1.0 / 21.04.2012
 */
public class BuchladenPersistence {

  private static Logger logger = Logger.getLogger(BuchladenPersistence.class);
  private static BuchladenPersistence singleton = null;
  private EntityManager em;

  private BuchladenPersistence() {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory(
        "buchladenDatabase");
    em = emf.createEntityManager();
  }
    
  @SuppressWarnings("unchecked")
  public List<Buch> alleBuecher() {
    logger.debug("alleBuecher: " + em);
    return em.createQuery(
        "select b from Buch b").getResultList();
  }

  public Buch holeBuch(long id) {
    logger.debug("holeBuch: " + em);
    return em.find(Buch.class, id);
  }
  
  public void speichereBuch(Buch buch) {
    logger.debug("speichereBuch: " + em);
    em.getTransaction().begin();
    em.persist(buch);
    em.getTransaction().commit();
  }
  
  public void loescheBuch(long id) {
    logger.debug("loescheBuch: " + em);
    em.getTransaction().begin();
    Buch buch = em.find(Buch.class, id);
    em.remove(buch);
    em.getTransaction().commit();
  }
  
  public boolean inventar(Bestellung bst) {
    boolean ok = true;
    em.getTransaction().begin();
    for (Bestellposition bp : bst.getBestellpositionen()) {
      Buch buch = em.find(Buch.class, bp.getBuch().getId());
      if (buch.getInventar() >= bp.getAnzahl()) {
        buch.setInventar(buch.getInventar() - bp.getAnzahl());
      }
      else {
        ok = false;
      }
    }
    if (ok) {
      em.getTransaction().commit();
    }
    else {
      em.getTransaction().rollback();
    }
    return ok;
  }
  
  public void resetInventar(Buch buch) {
    em.getTransaction().begin();
    buch = em.find(Buch.class, buch.getId());
    buch.setInventar(20);
    em.getTransaction().commit();
  }

  public static BuchladenPersistence getInstance() {
    if (singleton == null) {
      singleton = new BuchladenPersistence();
    }
    return singleton;
  }
}
