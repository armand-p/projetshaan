package projetShaan.shaan.boot.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Version;

@Entity
@Table
public class SpecialisationAcquis {

	@Id
	@GeneratedValue
	private Long id;
	@Version
	private Integer version;
	
	@ManyToOne
	@JoinColumn(name = "acquisSpe")
	private Specialisation specialisation;
	@ManyToOne
	@JoinColumn (name = "speAcquis")
	private Acquis acquis;
	
	
	public SpecialisationAcquis(Specialisation specialisation, Acquis acquis) {
		super();
		this.specialisation = specialisation;
		this.acquis = acquis;
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
	
	
}
