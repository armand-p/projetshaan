package projetShaan.shaan.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import createurShaan.model.Peuple;

public interface IPeupleRepository extends JpaRepository<Peuple, Long> {

}
