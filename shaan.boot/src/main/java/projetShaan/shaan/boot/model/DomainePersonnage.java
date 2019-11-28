package projetShaan.shaan.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table
public class DomainePersonnage {
	
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private Integer version;
	@Column
	@JsonView(Views.ViewCommon.class)
	private Integer rangDomaine;
	
	@ManyToOne
	@JoinColumn (name = "domainesPerso")
	@JsonView(Views.ViewDomainePersonnageDetail.class)
	private Domaine domaineLie;
	@ManyToOne
	@JoinColumn(name = "Personnage_ID")
	@JsonView(Views.ViewDomainePersonnageDetail.class)
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
