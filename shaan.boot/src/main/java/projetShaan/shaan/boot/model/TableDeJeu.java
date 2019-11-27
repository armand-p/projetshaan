package projetShaan.shaan.boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table
public class TableDeJeu {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column(length = 500)
	private String notes;
	@Column
	private String timer;
	@ManyToOne
	@JoinColumn(name = "Maitre_Du_Jeu_ID")
	private MaitreDuJeu maitreDuJeu;
	@OneToMany(mappedBy = "parties")
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
