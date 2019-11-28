package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetShaan.shaan.boot.model.AlterationPersonnage;

public interface IAlterationPersonnageRepository extends JpaRepository<AlterationPersonnage, Long>{

	@Query("select a from AlterationPersonnage a left join fetch a.persoLie p where p.id = :id")
	List<AlterationPersonnage> findByPersonnage(@Param("id") Long id);
	
}
