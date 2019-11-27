package projetShaan.shaan.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table
public class Metier {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private int version;
	@Column
	private String nomMetier;
	@Column
	private String voie;
	@Column(length = 5000)
	private String description;
	@OneToOne(mappedBy = "metier")
	private Specialisation specialisation;
	@OneToOne
	@JoinColumn(name = "Caste_ID")
	private Caste casteLie;

	public Metier() {
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

	public String getNomMetier() {
		return nomMetier;
	}

	public void setNomMetier(String nomMetier) {
		this.nomMetier = nomMetier;
	}

	public String getVoie() {
		return voie;
	}

	public void setVoie(String voie) {
		this.voie = voie;
	}

	public Specialisation getSpecialisation() {
		return specialisation;
	}

	public void setSpecialisation(Specialisation specialisation) {
		this.specialisation = specialisation;
	}

	public Caste getCasteLie() {
		return casteLie;
	}

	public void setCasteLie(Caste casteLie) {
		this.casteLie = casteLie;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
