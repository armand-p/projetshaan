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

@Entity
@Table
public class Acquis {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private Integer version;
	@Column(nullable = false)
	private String nom;
	@Column
	private String categorie;
	@Column
	private Integer classe;
	@Column
	private String protection;
	@Column(length = 5000)
	private String description;
	@Column
	private String capacité;
	@Column
	private Integer valeur;
	@Column
	private String type;
	
	@OneToMany (mappedBy = "acquis")
	private List <SpecialisationAcquis> speListe = new ArrayList <SpecialisationAcquis>();

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

}
