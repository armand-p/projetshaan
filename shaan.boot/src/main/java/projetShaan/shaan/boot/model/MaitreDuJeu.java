package projetShaan.shaan.boot.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("Maitre du jeu")
public class MaitreDuJeu extends Utilisateur {
	@OneToMany(mappedBy = "createur")
	private List<PersonnageNonJoueur> pnj = new ArrayList<PersonnageNonJoueur>();
	@OneToMany(mappedBy = "maitreDuJeu")
	private List<TableDeJeu> creation = new ArrayList<TableDeJeu>();

	public MaitreDuJeu() {
		super();
	}

	public List<PersonnageNonJoueur> getPnj() {
		return pnj;
	}

	public void setPnj(List<PersonnageNonJoueur> pnj) {
		this.pnj = pnj;
	}

	public List<TableDeJeu> getCreation() {
		return creation;
	}

	public void setCreation(List<TableDeJeu> creation) {
		this.creation = creation;
	}

}
