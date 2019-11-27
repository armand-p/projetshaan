package projetShaan.shaan.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projetShaan.shaan.boot.model.Personnage;

public interface IPersonnageRepository extends JpaRepository<Personnage, Long>{

}
