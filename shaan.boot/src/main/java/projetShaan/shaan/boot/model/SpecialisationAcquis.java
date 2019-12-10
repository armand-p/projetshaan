package projetShaan.shaan.boot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table
public class SpecialisationAcquis {

	@Id
	@GeneratedValue
	@JsonView(Views.ViewCommon.class)
	private Long id;
	@Version
	@JsonView(Views.ViewCommon.class)
	private Integer version;
	
	@JsonView(Views.ViewCommon.class)
	private Integer rangSpecialisation;
	
	@ManyToOne
	@JoinColumn(name = "acquisSpe")
	@JsonView(Views.ViewCommon.class)
	private Specialisation specialisation;
	@ManyToOne
	@JoinColumn (name = "speAcquis")
	@JsonView(Views.ViewSpecialisationAcquis.class)
	private Acquis acquis;
	
	
	public SpecialisationAcquis(Specialisation specialisation, Acquis acquis, Integer rangSpecialisation) {
		super();
		this.specialisation = specialisation;
		this.acquis = acquis;
		this.rangSpecialisation = rangSpecialisation;
	}
	
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
	public SpecialisationAcquis() {
		super();
	}
	public Integer getRangSpecialisation() {
		return rangSpecialisation;
	}
	public void setRangSpecialisation(Integer rangSpecialisation) {
		this.rangSpecialisation = rangSpecialisation;
	}
	
	
}
