package projetShaan.shaan.boot.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@DiscriminatorValue("PNJ")
public class PersonnageNonJoueur extends Personnage{
	@ManyToOne
	@JoinColumn(name = "Maitre_Du_Jeu_ID")
	private MaitreDuJeu createur;

	public PersonnageNonJoueur() {
		super();
	}

	public MaitreDuJeu getCreateur() {
		return createur;
	}

	public void setCreateur(MaitreDuJeu createur) {
		this.createur = createur;
	}
	
	

}
