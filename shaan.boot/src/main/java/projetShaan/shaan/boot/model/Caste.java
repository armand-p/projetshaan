package projetShaan.shaan.boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table
public class Caste {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@Column(nullable = false)
	@JsonView(Views.ViewCommon.class)
	private String nomCaste;
	@Column(length = 50000)
	@JsonView(Views.ViewCommon.class)
	private String description;
	
	@OneToOne
	@JoinColumn(name = "Domaine_ID")
	@JsonView(Views.ViewCasteDetail.class)
	private Domaine domaine;
	@OneToMany(mappedBy = "casteLie")
	@JsonView(Views.ViewMetierFromCaste.class)
	private List<Metier> metiers = new ArrayList<Metier>();

	public Caste() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public String getNomCaste() {
		return nomCaste;
	}

	public void setNomCaste(String nomCaste) {
		this.nomCaste = nomCaste;
	}

	public Domaine getDomaine() {
		return domaine;
	}

	public void setDomaine(Domaine domaine) {
		this.domaine = domaine;
	}

	public List<Metier> getMetiers() {
		return metiers;
	}

	public void setMetiers(List<Metier> metiers) {
		this.metiers = metiers;
	}

}
