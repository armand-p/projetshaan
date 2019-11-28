package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import projetShaan.shaan.boot.model.Joueur;

public interface IJoueurRepository extends JpaRepository<Joueur, Long>{
	@Query("From Joueur")
	List <Joueur> findAllJoueur();
}
