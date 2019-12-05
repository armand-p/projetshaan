package projetShaan.shaan.boot.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include=As.PROPERTY ,property = "type") @JsonSubTypes({

@JsonSubTypes.Type(value = MaitreDuJeu.class, name = "pnj"),
})
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public class Personnage {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String nom;
	@Column
	@JsonView(Views.ViewCommon.class)
	private float taille;
	@Enumerated(EnumType.STRING)
	@JsonView(Views.ViewCommon.class)
	@Column
	private Sexe sexe;
	@Column
	@JsonView(Views.ViewCommon.class)
	private Float poids;
	@Column
	@JsonView(Views.ViewCommon.class)
	private int age;
	@Column
	@JsonView(Views.ViewCommon.class)
	private int ame;
	@Column
	@JsonView(Views.ViewCommon.class)
	private int corps;
	@Column
	@JsonView(Views.ViewCommon.class)
	private int esprit;
	
	@OneToMany(mappedBy = "persoLie")
	@JsonView(Views.ViewAlterationPersoFromPersonnage.class)
	private List<AlterationPersonnage> alterationPersonnage = new ArrayList<AlterationPersonnage>();
	@ManyToOne
	@JoinColumn(name = "Joueur_ID")
	@JsonView(Views.ViewPersonnageDetail.class)
	private Joueur joueur;
	@ManyToOne
	@JoinColumn(name = "Race_ID")
	@JsonView(Views.ViewPersonnageDetail.class)
	private Race racePerso;
	@ManyToOne
	@JoinColumn(name = "Peuple_ID")
	@JsonView(Views.ViewPersonnageDetail.class)
	private Peuple peuplePerso;
	@ManyToOne
	@JoinColumn(name = "Metier_ID")
	@JsonView(Views.ViewPersonnageDetail.class)
	private Metier metierPerso;
	@ManyToOne
	@JoinColumn(name = "Caste_ID")
	@JsonView(Views.ViewPersonnageDetail.class)
	private Caste castePerso;
	@OneToMany(mappedBy = "persoLie")
	@JsonView(Views.ViewBonusPersoFromPersonnage.class)
	private List<BonusPersonnage> bonusPerso = new ArrayList<BonusPersonnage>();
	@OneToMany(mappedBy = "persoLie")
	@JsonView(Views.ViewDomainePersoFromPersonnage.class)
	private List<DomainePersonnage> domainesPerso = new ArrayList<DomainePersonnage>();
	@OneToMany(mappedBy = "persoLie")
	@JsonView(Views.ViewPouvoirPersoFromPersonnage.class)
	private List<PouvoirPersonnage> pouvoirsPerso = new ArrayList<PouvoirPersonnage>();
	@OneToMany(mappedBy = "persoLie")
	@JsonView(Views.ViewMotivationPersoFromPersonnage.class)
	private List<MotivationPersonnage> motivationsPerso = new ArrayList<MotivationPersonnage>();
	@ManyToOne
	@JoinColumn(name = "Partie_ID")
	@JsonView(Views.ViewPersonnageDetail.class)
	private TableDeJeu parties;

	public Personnage() {
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

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public float getTaille() {
		return taille;
	}

	public void setTaille(float taille) {
		this.taille = taille;
	}

	public Sexe getSexe() {
		return sexe;
	}

	public void setSexe(Sexe sexe) {
		this.sexe = sexe;
	}

	public Float getPoids() {
		return poids;
	}

	public void setPoids(Float poids) {
		this.poids = poids;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAme() {
		return ame;
	}

	public void setAme(int ame) {
		this.ame = ame;
	}

	public int getCorps() {
		return corps;
	}

	public void setCorps(int corps) {
		this.corps = corps;
	}

	public int getEsprit() {
		return esprit;
	}

	public void setEsprit(int esprit) {
		this.esprit = esprit;
	}

	public List<AlterationPersonnage> getAlterationPersonnage() {
		return alterationPersonnage;
	}

	public void setAlterationPersonnage(List<AlterationPersonnage> alterationPersonnage) {
		this.alterationPersonnage = alterationPersonnage;
	}

	public Joueur getJoueur() {
		return joueur;
	}

	public void setJoueur(Joueur joueur) {
		this.joueur = joueur;
	}

	public Race getRacePerso() {
		return racePerso;
	}

	public void setRacePerso(Race racePerso) {
		this.racePerso = racePerso;
	}

	public Peuple getPeuplePerso() {
		return peuplePerso;
	}

	public void setPeuplePerso(Peuple peuplePerso) {
		this.peuplePerso = peuplePerso;
	}

	public Metier getMetierPerso() {
		return metierPerso;
	}

	public void setMetierPerso(Metier metierPerso) {
		this.metierPerso = metierPerso;
	}

	public Caste getCastePerso() {
		return castePerso;
	}

	public void setCastePerso(Caste castePerso) {
		this.castePerso = castePerso;
	}

	public List<BonusPersonnage> getBonusPerso() {
		return bonusPerso;
	}

	public void setBonusPerso(List<BonusPersonnage> bonusPerso) {
		this.bonusPerso = bonusPerso;
	}

	public List<DomainePersonnage> getDomainesPerso() {
		return domainesPerso;
	}

	public void setDomainesPerso(List<DomainePersonnage> domainesPerso) {
		this.domainesPerso = domainesPerso;
	}

	public List<PouvoirPersonnage> getPouvoirsPerso() {
		return pouvoirsPerso;
	}

	public void setPouvoirsPerso(List<PouvoirPersonnage> pouvoirsPerso) {
		this.pouvoirsPerso = pouvoirsPerso;
	}

	public List<MotivationPersonnage> getMotivationsPerso() {
		return motivationsPerso;
	}

	public void setMotivationsPerso(List<MotivationPersonnage> motivationsPerso) {
		this.motivationsPerso = motivationsPerso;
	}

	public TableDeJeu getParties() {
		return parties;
	}

	public void setParties(TableDeJeu parties) {
		this.parties = parties;
	}

}
