package projetShaan.shaan.boot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table
public class BonusPersonnage {
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private Integer version;
	@Column
	private Integer bonusAcquis;
	@Column
	private Integer bonusPerso;
	
	@ManyToOne
	@JoinColumn (name = "specilisationId")
	private Specialisation specialisation;
	@ManyToOne 
	@JoinColumn (name = "acquisId")
	private Acquis acquis;
	@ManyToOne
	@JoinColumn(name = "Personnage_ID")
	private Personnage persoLie;
	
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
	public Integer getBonusAcquis() {
		return bonusAcquis;
	}
	public void setBonusAcquis(Integer bonusAcquis) {
		this.bonusAcquis = bonusAcquis;
	}
	public Integer getBonusPerso() {
		return bonusPerso;
	}
	public void setBonusPerso(Integer bonusPerso) {
		this.bonusPerso = bonusPerso;
	}
	public Specialisation getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(Specialisation specialisation) {
		this.specialisation = specialisation;
	}
	public Acquis getAcquis() {
		return acquis;
	}
	public void setAcquis(Acquis acquis) {
		this.acquis = acquis;
	}
	public Personnage getPersoLie() {
		return persoLie;
	}
	public void setPersoLie(Personnage persoLie) {
		this.persoLie = persoLie;
	}
	public BonusPersonnage() {
		super();
	}
	
	
}
