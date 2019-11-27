package projetShaan.shaan.boot.model;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table
public class Acquis {
	
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private Integer version;
	@Column(nullable = false)
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@Column(length = 5000)
	@JsonView(Views.ViewCommon.class)
	private String categorie;
	@Column
	@JsonView(Views.ViewCommon.class)
	private Integer classe;
	@Column(length = 5000)
	@JsonView(Views.ViewCommon.class)
	private String protection;
	@Column(length = 5000)
	@JsonView(Views.ViewCommon.class)
	private String description;
	@Column(length = 5000)
	@JsonView(Views.ViewCommon.class)
	private String capacité;
	@Column
	@JsonView(Views.ViewCommon.class)
	private Integer valeur;
	@Column(length = 5000)
	@JsonView(Views.ViewCommon.class)
	private String type;
	@Column
	@JsonView(Views.ViewCommon.class)
	private Integer prestige;
	
	@OneToMany (mappedBy = "acquis")
	@JsonView(Views.ViewAcquisDetail.class)
	private List <SpecialisationAcquis> speListe = new ArrayList <SpecialisationAcquis>();

	public Long getId() {
		return id;
	}
	
	public Integer getPrestige() {
		return prestige;
	}

	public void setPrestige(Integer prestige) {
		this.prestige = prestige;
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

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public Integer getClasse() {
		return classe;
	}

	public void setClasse(Integer classe) {
		this.classe = classe;
	}

	public String getProtection() {
		return protection;
	}

	public void setProtection(String protection) {
		this.protection = protection;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCapacité() {
		return capacité;
	}

	public void setCapacité(String capacité) {
		this.capacité = capacité;
	}

	public Integer getValeur() {
		return valeur;
	}

	public void setValeur(Integer valeur) {
		this.valeur = valeur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<SpecialisationAcquis> getSpeListe() {
		return speListe;
	}

	public void setSpeListe(List<SpecialisationAcquis> speListe) {
		this.speListe = speListe;
	}

	public Acquis() {
		super();
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
