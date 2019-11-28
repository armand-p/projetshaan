package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetShaan.shaan.boot.model.MotivationPersonnage;
public interface IMotivationPersonnageRepository extends JpaRepository<MotivationPersonnage, Long>{

	@Query("select m from MotivationPersonnage m left join fetch m.persoLie p where p.id = :id")
	List<MotivationPersonnage> findByPersonnage(@Param("id") Long id);
	
}
