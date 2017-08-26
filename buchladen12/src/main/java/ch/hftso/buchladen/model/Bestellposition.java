package ch.hftso.buchladen.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Bestellposition Entitaet
 * 
 * @author Ruedi Baumann
 * @version 1.0 / 21.04.2012
 */
@Entity
public class Bestellposition implements java.io.Serializable {
  private static final long serialVersionUID = -2239111492308739886L;

  private long id;
  private Buch buch;
  private Bestellung bestellung;
  private int anzahl;

  public Bestellposition() {
  }

  public Bestellposition(Buch buch, Bestellung bestellung, int anzahl) {
    this.buch = buch;
    this.bestellung = bestellung;
    this.anzahl = anzahl;
  }

  @Id
  @GeneratedValue
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }
  
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "buchid", nullable = false)
  public Buch getBuch() {
    return buch;
  }

  public void setBuch(Buch buch) {
    this.buch = buch;
  }
  
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "bestellungid", nullable = false)
  public Bestellung getBestellung() {
    return bestellung;
  }

  public void setBestellung(Bestellung bestellung) {
    this.bestellung = bestellung;
  }

  public int getAnzahl() {
    return anzahl;
  }

  public void setAnzahl(int anzahl) {
    this.anzahl = anzahl;
  }
}
