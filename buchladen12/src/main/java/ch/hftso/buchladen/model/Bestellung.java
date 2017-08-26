package ch.hftso.buchladen.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.validator.NotNull;

/**
 * Bestellung Entitaet
 * 
 * @author Ruedi Baumann
 * @version 1.0 / 21.04.2012
 */
@Entity
public class Bestellung implements java.io.Serializable {
  private static final long serialVersionUID = 5656146687994617745L;
  
  private long id;
	private String kunde;
	private Date bestelldatum;
	private Set<Bestellposition> bestellpositionen = new HashSet<Bestellposition>(
			0);

	public Bestellung() {
	}

	public Bestellung(String kunde, Date bestelldatum) {
		this.kunde = kunde;
		this.bestelldatum = bestelldatum;
	}
	
	@Id
	@GeneratedValue
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public String getKunde() {
    return kunde;
  }

  public void setKunde(String kunde) {
    this.kunde = kunde;
  }

  @Temporal(TemporalType.DATE)
	@NotNull
	public Date getBestelldatum() {
		return this.bestelldatum;
	}

	public void setBestelldatum(Date bestelldatum) {
		this.bestelldatum = bestelldatum;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, 
	           mappedBy = "bestellung")
	public Set<Bestellposition> getBestellpositionen() {
		return this.bestellpositionen;
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
