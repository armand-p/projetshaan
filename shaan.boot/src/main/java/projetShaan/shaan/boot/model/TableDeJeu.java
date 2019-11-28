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
public class TableDeJeu {
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
	@Column(length = 500)
	@JsonView(Views.ViewCommon.class)
	private String notes;
	@Column
	@JsonView(Views.ViewCommon.class)
	private String timer;
	@Column
	@JsonView(Views.ViewCommon.class)
	private Boolean statut;
	@Column
	@JsonView(Views.ViewCommon.class)
	private Boolean connection;
	@ManyToOne
	@JoinColumn(name = "Maitre_Du_Jeu_ID")
	@JsonView(Views.ViewTableDeJeuDetail.class)
	private MaitreDuJeu maitreDuJeu;
	@OneToMany(mappedBy = "parties")
	@JsonView(Views.ViewTableDeJeuDetail.class)
	private List<Personnage> personnages = new ArrayList<Personnage>();

	public TableDeJeu() {
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

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getTimer() {
		return timer;
	}

	public void setTimer(String timer) {
		this.timer = timer;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Boolean getStatut() {
		return statut;
	}

	public void setStatut(Boolean statut) {
		this.statut = statut;
	}

	public Boolean getConnection() {
		return connection;
	}

	public void setConnection(Boolean connection) {
		this.connection = connection;
	}

	public MaitreDuJeu getMaitreDuJeu() {
		return maitreDuJeu;
	}

	public void setMaitreDuJeu(MaitreDuJeu maitreDuJeu) {
		this.maitreDuJeu = maitreDuJeu;
	}

	public List<Personnage> getPersonnages() {
		return personnages;
	}

	public void setPersonnages(List<Personnage> personnages) {
		this.personnages = personnages;
	}

}
