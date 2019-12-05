package projetShaan.shaan.boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonView;
@JsonTypeName("joueur")
@Entity
@DiscriminatorValue("Joueur")
public class Joueur extends Utilisateur{
	@OneToMany(mappedBy = "joueur")
	@JsonView(Views.ViewJoueurDetail.class)
	private List<Personnage> personnages = new ArrayList<Personnage>();

	public Joueur() {
		super();
	}

	public List<Personnage> getPersonnages() {
		return personnages;
	}

	public void setPersonnages(List<Personnage> personnages) {
		this.personnages = personnages;
	}
	
	

}
