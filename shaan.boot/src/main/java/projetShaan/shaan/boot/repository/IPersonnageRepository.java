package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetShaan.shaan.boot.model.Personnage;
import projetShaan.shaan.boot.model.PersonnageNonJoueur;

public interface IPersonnageRepository extends JpaRepository<Personnage, Long>{

	@Query("from PersonnageNonJoueur")
	List <PersonnageNonJoueur> findAllPersonnageNonJoueur();
	
	@Query("select p from Personnage p left join p.joueur j where j.id = :id")
	List<Personnage>findByJoueur(@Param("id") Long id);

	@Query("select p from Personnage p where p.parties.id = :id")
	List<Personnage>findByTableDeJeu(@Param("id") Long id);
	

}
