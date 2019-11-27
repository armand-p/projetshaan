package projetShaan.shaan.boot.model;

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
public class MotivationPersonnage {
	
	@Id
	@GeneratedValue
	private Long id;
	@Version
	private Integer version;
	
	@ManyToOne
	@JoinColumn(name = "Personnage_ID")
	private Personnage persoLie;
	@ManyToOne
	@JoinColumn (name = "motivation_id")
	private Motivation motivation;
	
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
	public Personnage getPersoLie() {
		return persoLie;
	}
	public void setPersoLie(Personnage persoLie) {
		this.persoLie = persoLie;
	}
	public Motivation getMotivation() {
		return motivation;
	}
	public void setMotivation(Motivation motivation) {
		this.motivation = motivation;
	}
	public MotivationPersonnage() {
		super();
	}
	
	

}
