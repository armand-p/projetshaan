package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetShaan.shaan.boot.model.Caste;
import projetShaan.shaan.boot.model.Metier;

public interface ICasteRepository extends JpaRepository<Caste, Long>{
	
	@Query("select distinct m from Metier m left join fetch m.casteLie c where c.id = :id")
	List<Metier> findAllMetier(@Param("id") Long id);
}
