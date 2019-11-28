package projetShaan.shaan.boot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import projetShaan.shaan.boot.model.Joueur;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IJoueurRepository;

@RestController
@RequestMapping("/joueur")
public class JoueurController {
	
	@Autowired
	private IJoueurRepository joueurRepo;

	@GetMapping("")
	@JsonView(Views.ViewJoueur.class)
	public List<Joueur>list(){
		List<Joueur> Joueurs = joueurRepo.findAll();
		return Joueurs;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewJoueurDetail.class)
	public Joueur find(@PathVariable Long id) {
		Joueur Joueur = joueurRepo.findById(id).get();
		return Joueur;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewJoueur.class)
	public Joueur create (@RequestBody Joueur Joueur) {
		return joueurRepo.save(Joueur);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewJoueur.class)
	public Joueur update(@RequestBody Joueur Joueur, @PathVariable Long id) {
		return joueurRepo.save(Joueur);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		joueurRepo.deleteById(id);
	}
}

