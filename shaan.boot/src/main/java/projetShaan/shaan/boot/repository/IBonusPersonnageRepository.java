package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetShaan.shaan.boot.model.BonusPersonnage;
public interface IBonusPersonnageRepository extends JpaRepository<BonusPersonnage, Long>{

	@Query("select b from BonusPersonnage b left join fetch b.persoLie p where p.id = :id")
	List<BonusPersonnage> findByPersonnage(@Param("id") Long id);
	
}
