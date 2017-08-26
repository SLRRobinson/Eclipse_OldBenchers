package ch.hftso.buchladen.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Buch Entitaet
 * 
 * @author Ruedi Baumann
 * @version 1.0 / 21.04.2012
 */
@Entity
public class Buch implements Serializable {
  private static final long serialVersionUID = 7162373688066486256L;
  
  private long id;
  private String nachname;
  private String vorname;
  private String titel;
  private double preis;
  private int jahr;
  private String beschreibung;
  private int inventar;
  private Set<Bestellposition> bestellpositionen = new HashSet<Bestellposition>(
      0);

  public Buch() {
  }
  
  public Buch(String nachname, String vorname, String titel,
      double preis, int jahr, String beschreibung, int inventar) {
    this.nachname = nachname;
    this.vorname = vorname;
    this.titel = titel;
    this.preis = preis;
    this.jahr = jahr;
    this.beschreibung = beschreibung;
    this.inventar = inventar;
  }

  public String getBeschreibung() {
    return beschreibung;
  }

  public void setBeschreibung(String beschreibung) {
    this.beschreibung = beschreibung;
  }

  @Id
  @GeneratedValue
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public int getInventar() {
    return inventar;
  }

  public void setInventar(int inventar) {
    this.inventar = inventar;
  }

  public int getJahr() {
    return jahr;
  }

  public void setJahr(int jahr) {
    this.jahr = jahr;
  }

  public String getNachname() {
    return nachname;
  }

  public void setNachname(String nachname) {
    this.nachname = nachname;
  }

  public double getPreis() {
    return preis;
  }

  public void setPreis(double preis) {
    this.preis = preis;
  }

  public String getTitel() {
    return titel;
  }

  public void setTitel(String titel) {
    this.titel = titel;
  }

  public String getVorname() {
    return vorname;
  }

  public void setVorname(String vorname) {
    this.vorname = vorname;
  }

  @OneToMany(cascade = CascadeType.REMOVE, fetch = FetchType.EAGER, 
             mappedBy = "buch")
  public Set<Bestellposition> getBestellpositionen() {
    return bestellpositionen;
  }

  public void setBestellpositionen(Set<Bestellposition> bestellpositionen) {
    this.bestellpositionen = bestellpositionen;
  }  

  public void addBestellposition(Bestellposition bestellposition) {
    bestellpositionen.add(bestellposition);
  }
  
  public void removeBestellposition(Bestellposition bestellposition) {
    bestellpositionen.remove(bestellposition);
  }
}
