package projetShaan.shaan.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetShaan.shaan.boot.model.Utilisateur;

public interface IUtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
