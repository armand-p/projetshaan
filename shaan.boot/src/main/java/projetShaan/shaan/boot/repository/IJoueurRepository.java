package projetShaan.shaan.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projetShaan.shaan.boot.model.Joueur;

public interface IJoueurRepository extends JpaRepository<Joueur, Long>{
}
