package projetShaan.shaan.boot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import projetShaan.shaan.boot.model.Peuple;

public interface IPeupleRepository extends JpaRepository<Peuple, Long> {

}
