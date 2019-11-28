package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetShaan.shaan.boot.model.PouvoirPersonnage;
public interface IPouvoirPersonnageRepository extends JpaRepository<PouvoirPersonnage, Long>{

	@Query("select pp from PouvoirPersonnage pp left join fetch pp.persoLie p where p.id = :id")
	List<PouvoirPersonnage> findByPersonnage(@Param("id") Long id);
}
