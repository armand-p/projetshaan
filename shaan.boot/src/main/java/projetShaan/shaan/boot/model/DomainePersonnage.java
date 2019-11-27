package projetShaan.shaan.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table
public class DomainePersonnage {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private Integer version;
	@Column
	private Integer rangDomaine;
	
	@ManyToOne
	@JoinColumn (name = "domainesPerso")
	private Domaine domaineLie;
	@ManyToOne
	@JoinColumn(name = "Personnage_ID")
	private Personnage persoLie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Integer getRangDomaine() {
		return rangDomaine;
	}

	public void setRangDomaine(Integer rangDomaine) {
		this.rangDomaine = rangDomaine;
	}

	public Domaine getDomaineLie() {
		return domaineLie;
	}

	public void setDomaineLie(Domaine domaineLie) {
		this.domaineLie = domaineLie;
	}

	public Personnage getPersoLie() {
		return persoLie;
	}

	public void setPersoLie(Personnage persoLie) {
		this.persoLie = persoLie;
	}

	public DomainePersonnage() {
		super();
	}

	
}
