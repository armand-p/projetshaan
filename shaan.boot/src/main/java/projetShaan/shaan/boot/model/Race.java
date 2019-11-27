package projetShaan.shaan.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table
public class Race {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@Column(nullable = false)
	@JsonView(Views.ViewCommon.class)
	private String nomRace;
	@OneToOne
	@JoinColumn(name = "Domaine_ID")
	@JsonView(Views.ViewRaceDetail.class)
	private Domaine domaine;
	@OneToOne
	@JoinColumn(name = "Specialisation_1_ID")
	@JsonView(Views.ViewRaceDetail.class)
	private Specialisation specialisation1;
	@OneToOne
	@JoinColumn(name = "Specialisation_2_ID")
	@JsonView(Views.ViewRaceDetail.class)
	private Specialisation specialisation2;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String tailleEstimation;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String poidsEstimation;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String langues;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String pouvoirDeRace;
	@OneToOne
	@JoinColumn(name = "Peuple_ID")
	@JsonView(Views.ViewRaceDetail.class)
	private Peuple peupleOrigine;
	@OneToOne
	@JoinColumn(name = "Caste_ID")
	@JsonView(Views.ViewRaceDetail.class)
	private Caste castePredilection;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String elementTotem;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String couleurSymbolique;

	public Race() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNomRace() {
		return nomRace;
	}

	public void setNomRace(String nomRace) {
		this.nomRace = nomRace;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	public Specialisation getSpecialisation1() {
		return specialisation1;
	}

	public void setSpecialisation1(Specialisation specialisation1) {
		this.specialisation1 = specialisation1;
	}

	public Specialisation getSpecialisation2() {
		return specialisation2;
	}

	public void setSpecialisation2(Specialisation specialisation2) {
		this.specialisation2 = specialisation2;
	}

	public String getTailleEstimation() {
		return tailleEstimation;
	}

	public void setTailleEstimation(String tailleEstimation) {
		this.tailleEstimation = tailleEstimation;
	}

	public String getPoidsEstimation() {
		return poidsEstimation;
	}

	public void setPoidsEstimation(String poidsEstimation) {
		this.poidsEstimation = poidsEstimation;
	}

	public String getLangues() {
		return langues;
	}

	public void setLangues(String langues) {
		this.langues = langues;
	}

	public String getPouvoirDeRace() {
		return pouvoirDeRace;
	}

	public void setPouvoirDeRace(String pouvoirDeRace) {
		this.pouvoirDeRace = pouvoirDeRace;
	}

	public Peuple getPeupleOrigine() {
		return peupleOrigine;
	}

	public void setPeupleOrigine(Peuple peupleOrigine) {
		this.peupleOrigine = peupleOrigine;
	}

	public Caste getCastePredilection() {
		return castePredilection;
	}

	public void setCastePredilection(Caste castePredilection) {
		this.castePredilection = castePredilection;
	}

	public String getElementTotem() {
		return elementTotem;
	}

	public void setElementTotem(String elementTotem) {
		this.elementTotem = elementTotem;
	}

	public String getCouleurSymbolique() {
		return couleurSymbolique;
	}

	public void setCouleurSymbolique(String couleurSymbolique) {
		this.couleurSymbolique = couleurSymbolique;
	}

}
