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

import projetShaan.shaan.boot.model.Joueur;
import projetShaan.shaan.boot.model.MaitreDuJeu;
import projetShaan.shaan.boot.model.Personnage;
import projetShaan.shaan.boot.model.Utilisateur;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IJoueurRepository;
import projetShaan.shaan.boot.repository.IMaitreDuJeuRepository;
import projetShaan.shaan.boot.repository.IPersonnageRepository;
import projetShaan.shaan.boot.repository.IUtilisateurRepository;

@CrossOrigin("*")
@RestController
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@Autowired
	private IUtilisateurRepository userRepo;
	
	@Autowired
	private IJoueurRepository joueurRepo;
	
	@Autowired
	private IMaitreDuJeuRepository maitreRepo;
	
	@Autowired
	private IPersonnageRepository persoRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewCommon.class)
	public List<Utilisateur>list(){
		List<Utilisateur> utilisateurs = userRepo.findAll();
		return utilisateurs;
	}
	
	@GetMapping("/joueur")
	@JsonView(Views.ViewJoueur.class)
	public List<Joueur>listJoueur(){
		List<Joueur> joueur = joueurRepo.findAll();
		return joueur;
	}
	@GetMapping("/mj")
	@JsonView(Views.ViewMaitreDuJeu.class)
	public List<MaitreDuJeu>MaitreDuJoueur(){
		List<MaitreDuJeu> mj = maitreRepo.findAll();
		return mj;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewUtilisateurDetail.class)
	public Utilisateur findUtilisateur(@PathVariable Long id) {
		Utilisateur utilisateur = userRepo.findById(id).get();
		return utilisateur;
	}
	
	@GetMapping("/mj/{id}")
	@JsonView(Views.ViewMaitreDuJeuDetail.class)
	public MaitreDuJeu findMJ(@PathVariable Long id){
		MaitreDuJeu maitreDuJeu = maitreRepo.findById(id).get();
		return maitreDuJeu;
	}
	
	
	@GetMapping("/joueur/{id}")
	@JsonView(Views.ViewJoueurDetail.class)
	public Joueur findJoueur(@PathVariable Long id) {
		Joueur joueur = joueurRepo.findById(id).get();
		return joueur;
	}
	
	@GetMapping("/{id}/persos")
	@JsonView(Views.ViewPersonnageDetail.class)
	public List<Personnage> findByJoueur(@PathVariable Long id){
		List<Personnage> personnages = persoRepo.findByJoueur(id);
		return personnages;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewUtilisateur.class)
	public Utilisateur create (@RequestBody Utilisateur Utilisateur) {
		return userRepo.save(Utilisateur);
	}
	@PutMapping("/{id}")
	@JsonView(Views.ViewMaitreDuJeu.class)
	public Utilisateur update(@RequestBody Utilisateur Utilisateur, @PathVariable Long id) {
		return userRepo.save(Utilisateur);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		userRepo.deleteById(id);
	}
}
