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
public class Peuple {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@Column(nullable = false)
	@JsonView(Views.ViewCommon.class)
	private String nomPeuple;
	@Column(length = 5000)
	@JsonView(Views.ViewCommon.class)
	private String description;
	@OneToOne
	@JoinColumn(name = "Domaine_ID")
	@JsonView(Views.ViewPeupleDetail.class)
	private Domaine domaine;
	@OneToOne
	@JoinColumn(name = "Specialisation_1_ID")
	@JsonView(Views.ViewPeupleDetail.class)
	private Specialisation specialisation1;
	@OneToOne
	@JoinColumn(name = "Specialisation_2_ID")
	@JsonView(Views.ViewPeupleDetail.class)
	private Specialisation specialisation2;

	public Peuple() {
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

	public String getNomPeuple() {
		return nomPeuple;
	}

	public void setNomPeuple(String nomPeuple) {
		this.nomPeuple = nomPeuple;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
