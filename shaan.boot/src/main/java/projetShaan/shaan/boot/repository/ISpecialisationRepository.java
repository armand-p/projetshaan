package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetShaan.shaan.boot.model.Specialisation;
public interface ISpecialisationRepository extends JpaRepository<Specialisation, Long>{
	
	@Query("select s from Specialisation s left join fetch s.domaineLie d where d.id = :id")
	List<Specialisation> findByDomaine(@Param("id") Long id);
}
