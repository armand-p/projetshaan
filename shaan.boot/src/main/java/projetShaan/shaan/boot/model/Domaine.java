package projetShaan.shaan.boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table
public class Domaine {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private Integer version;
	@Column(nullable = false)
	private String nom;
	@Column
	private String elementLie;
	@Column(length = 5000)
	private String description;

	@OneToMany(mappedBy = "domaineLie")
	private List<Motivation> typeMotivation = new ArrayList<Motivation>();
	@OneToMany(mappedBy = "domaineLie")
	private List<Specialisation> listeSpe = new ArrayList<Specialisation>();
	@OneToMany(mappedBy = "domaineLie")
	private List<Pouvoir> listePouvoir = new ArrayList<Pouvoir>();

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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getElementLie() {
		return elementLie;
	}

	public void setElementLie(String elementLie) {
		this.elementLie = elementLie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Motivation> getTypeMotivation() {
		return typeMotivation;
	}

	public void setTypeMotivation(List<Motivation> typeMotivation) {
		this.typeMotivation = typeMotivation;
	}

	public List<Specialisation> getListeSpe() {
		return listeSpe;
	}

	public void setListeSpe(List<Specialisation> listeSpe) {
		this.listeSpe = listeSpe;
	}

	public List<Pouvoir> getListePouvoir() {
		return listePouvoir;
	}

	public void setListePouvoir(List<Pouvoir> listePouvoir) {
		this.listePouvoir = listePouvoir;
	}

	public Domaine() {
		super();
	}

}
