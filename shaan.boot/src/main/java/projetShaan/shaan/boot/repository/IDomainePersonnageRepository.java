package projetShaan.shaan.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projetShaan.shaan.boot.model.DomainePersonnage;
public interface IDomainePersonnageRepository extends JpaRepository<DomainePersonnage, Long>{

}