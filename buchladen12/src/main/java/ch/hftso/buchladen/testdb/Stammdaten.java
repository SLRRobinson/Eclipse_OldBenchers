package ch.hftso.buchladen.testdb;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import ch.hftso.buchladen.model.Buch;
import ch.hftso.buchladen.persistence.BuchladenPersistence;

/**
 * TestNG fuer die Datenbankmethoden.
 *
 * @author Ruedi Baumann
 * @version 1.0 / 21.04.2012
 */
public class Stammdaten {
  private static Logger logger = Logger.getLogger(Stammdaten.class);
  private BuchladenPersistence db;
  
  @BeforeClass
  public void initDB() {
    db = BuchladenPersistence.getInstance();
    logger.debug("DB: " + db);
  }
  
  @Test
  public void einlesen() {
    if (db.alleBuecher().size() == 0) {
      db.speichereBuch(new Buch("Hunter", "Jason", "Java Servlet Programming", 
          70.95, 2001, "Internationalisierung ist ausführlich erklärt.", 20));
      db.speichereBuch(new Buch("Goodwill", "James", "Developing Java Servlets",
          69.75, 2002, "Exzellente JDBC Ausführungen.", 20));
      db.speichereBuch(new Buch("Callaway", "Dustin R.", "Inside Servlets",
          88.50, 2003, "Gute Session-Ausführungen.", 20));
      db.speichereBuch(new Buch("Williamson", "Alan R.", "Java Servlets by Example",
          60.10, 2001, "Durchschnittliche Beispiele.", 20));
      db.speichereBuch(new Buch("Moss", "Karl", "Java Servlets",
          77.75, 2000, "Sicherheit ist thematisiert.", 20));
      logger.debug("Bücher eingelesen!");
    }
    assert db.alleBuecher().size() == 5 : "Einlesen misslungen!!!";
  }
  
  @Test(dependsOnMethods="einlesen")
  public void inventar() {
    for (Buch b : db.alleBuecher()) {
      db.resetInventar(b);
      assert b.getInventar() == 20 : "Reset Inventar misslungen!!!";
    }
  }
}
