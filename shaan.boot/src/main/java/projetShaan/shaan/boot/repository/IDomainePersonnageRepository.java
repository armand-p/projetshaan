package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetShaan.shaan.boot.model.DomainePersonnage;
public interface IDomainePersonnageRepository extends JpaRepository<DomainePersonnage, Long>{

	@Query("select d from DomainePersonnage d left join fetch d.persoLie p where p.id = :id")
	List<DomainePersonnage> findByPersonnage(@Param("id") Long id);
	
}
