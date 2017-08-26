package ch.hftso.buchladen.business;

import java.util.List;

import org.apache.log4j.Logger;

import ch.hftso.buchladen.model.Bestellung;
import ch.hftso.buchladen.model.Buch;
import ch.hftso.buchladen.persistence.BuchladenPersistence;

/**
 * HFT-SO Modul 626
 * Aufbau eines einfachen Buchladens mit Servlets.
 * Businessschicht.
 *
 * @author Ruedi Baumann
 * @version 1.0 / 21.04.2012
 */
public class BuchladenBusiness {
  private static Logger logger = Logger.getLogger(BuchladenBusiness.class);
  private static BuchladenBusiness singleton = null;
  private BuchladenPersistence db = BuchladenPersistence.getInstance();
  
  private BuchladenBusiness() {
  }
    
  public List<Buch> alleBuecher() {
    logger.debug("alleBuecher");
    return db.alleBuecher();
  }

  public Buch holeBuch(long id) {
    logger.debug("holeBuch");
    return db.holeBuch(id);
  }
  
  public void speichereBuch(Buch buch) {
    logger.debug("speichereBuch");
    db.speichereBuch(buch);
  }
  
  public void loescheBuch(long id) {
    logger.debug("loescheBuch");
    db.loescheBuch(id);
  }
  
  public boolean inventar(Bestellung bst) {
    return db.inventar(bst);
  }
  
  public void resetInventar(Buch buch) {
    db.resetInventar(buch);
  }

  public Buch addBuch(long id, Bestellung bst) {

    return null;
  }
  
  public Buch removeBuch(long id, Bestellung bst) {

    return null;
  }
  
  public void removeAlleBuecher(Bestellung bst) {
    bst.getBestellpositionen().clear();
  }
  
  public String totalPreisBestellung(Bestellung bst) {

    return null;
  }
  
  public static BuchladenBusiness getInstance() {
    if (singleton == null) {
      singleton = new BuchladenBusiness();
    }
    return singleton;
  }
}
