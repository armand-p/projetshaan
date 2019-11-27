package projetShaan.shaan.boot.model;

import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table
public class AlterationPersonnage {
	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private int version;
	@ManyToOne
	@JoinColumn(name = "Personnage_ID")
	@JsonView(Views.ViewAlterationPersonnageDetail.class)
	private Personnage persoLie;
	@ManyToOne
	@JoinColumn(name = "Alteration_ID")
	@JsonView(Views.ViewAlterationPersonnageDetail.class)
	private AlterationEtat alterationEtat;

	public AlterationPersonnage() {
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

	public Personnage getPersoLie() {
		return persoLie;
	}

	public void setPersoLie(Personnage persoLie) {
		this.persoLie = persoLie;
	}

	public AlterationEtat getAlterationEtat() {
		return alterationEtat;
	}

	public void setAlterationEtat(AlterationEtat alterationEtat) {
		this.alterationEtat = alterationEtat;
	}

}
