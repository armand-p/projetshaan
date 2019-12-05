package projetShaan.shaan.boot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import projetShaan.shaan.boot.model.PersonnageNonJoueur;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IPersonnageRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/personnageNonJoueur")
public class PersonnageNonJoueurController {
	
	@Autowired
	private IPersonnageRepository personnageNonJoueurRepo;

	@GetMapping("")
	@JsonView(Views.ViewPersonnageNonJoueur.class)
	public List<PersonnageNonJoueur>list(){
		List<PersonnageNonJoueur> PersonnageNonJoueurs = personnageNonJoueurRepo.findAllPersonnageNonJoueur();
		return PersonnageNonJoueurs;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPersonnageNonJoueurDetail.class)
	public PersonnageNonJoueur find(@PathVariable Long id) {
		PersonnageNonJoueur PersonnageNonJoueur = (PersonnageNonJoueur) personnageNonJoueurRepo.findById(id).get();
		return PersonnageNonJoueur;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewPersonnageNonJoueur.class)
	public PersonnageNonJoueur create (@RequestBody PersonnageNonJoueur PersonnageNonJoueur) {
		return personnageNonJoueurRepo.save(PersonnageNonJoueur);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewPersonnageNonJoueur.class)
	public PersonnageNonJoueur update(@RequestBody PersonnageNonJoueur PersonnageNonJoueur, @PathVariable Long id) {
		return personnageNonJoueurRepo.save(PersonnageNonJoueur);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		personnageNonJoueurRepo.deleteById(id);
	}
}

