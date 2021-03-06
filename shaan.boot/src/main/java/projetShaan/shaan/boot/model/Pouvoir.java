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
public class Pouvoir {
	
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private Integer version;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String nomPouvoir;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String rang;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String type;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String test;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String frequence;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String activation;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String portee;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String cible;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String nbCible;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String typeDegat;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String duree;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String cout;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String degats;
	@Column (length = 5000)
	@JsonView(Views.ViewCommon.class)
	private String description;
	
	@ManyToOne
	@JoinColumn (name = "pouvoirsDomaine")
	@JsonView({Views.ViewPouvoir.class,Views.ViewPouvoirPersonnageDetail.class})
	private Domaine domaineLie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDegats() {
		return degats;
	}

	public void setDegats(String degats) {
		this.degats = degats;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getNomPouvoir() {
		return nomPouvoir;
	}

	public void setNomPouvoir(String nomPouvoir) {
		this.nomPouvoir = nomPouvoir;
	}

	public String getRang() {
		return rang;
	}

	public void setRang(String rang) {
		this.rang = rang;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	}

	public String getFrequence() {
		return frequence;
	}

	public void setFrequence(String frequence) {
		this.frequence = frequence;
	}

	public String getActivation() {
		return activation;
	}

	public void setActivation(String activation) {
		this.activation = activation;
	}

	public String getPortee() {
		return portee;
	}

	public void setPortee(String portee) {
		this.portee = portee;
	}

	public String getCible() {
		return cible;
	}

	public void setCible(String cible) {
		this.cible = cible;
	}

	public String getNbCible() {
		return nbCible;
	}

	public void setNbCible(String string) {
		this.nbCible = string;
	}

	public String getTypeDegat() {
		return typeDegat;
	}

	public void setTypeDegat(String typeDegat) {
		this.typeDegat = typeDegat;
	}

	public String getDuree() {
		return duree;
	}

	public void setDuree(String duree) {
		this.duree = duree;
	}

	public String getCout() {
		return cout;
	}

	public void setCout(String cout) {
		this.cout = cout;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Domaine getDomaineLie() {
		return domaineLie;
	}

	public void setDomaineLie(Domaine domaineLie) {
		this.domaineLie = domaineLie;
	}

	public Pouvoir() {
		super();
	}
	
	

}
