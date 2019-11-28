package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import projetShaan.shaan.boot.model.Personnage;
import projetShaan.shaan.boot.model.PersonnageNonJoueur;

public interface IPersonnageRepository extends JpaRepository<Personnage, Long>{

	@Query("from PersonnageNonJoueur")
	List <PersonnageNonJoueur> findAllPersonnageNonJoueur();
	
}
