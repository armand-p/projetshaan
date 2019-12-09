package projetShaan.shaan.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import projetShaan.shaan.boot.model.Specialisation;
import projetShaan.shaan.boot.model.TableDeJeu;

public interface ITableDeJeuRepository extends JpaRepository<TableDeJeu, Long>{

	@Query("select t from TableDeJeu t where t.maitreDuJeu.id = :id")
	List<TableDeJeu> findAllByMasterOfTheGame(@Param("id") Long id);
	
	
}
