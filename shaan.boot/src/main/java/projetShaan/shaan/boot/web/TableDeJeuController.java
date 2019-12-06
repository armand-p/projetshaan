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

import projetShaan.shaan.boot.model.Personnage;
import projetShaan.shaan.boot.model.TableDeJeu;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IPersonnageRepository;
import projetShaan.shaan.boot.repository.ITableDeJeuRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/tableDeJeu")

public class TableDeJeuController {
	@Autowired
	private ITableDeJeuRepository tableDeJeuRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewTableDeJeu.class)
	public List<TableDeJeu>list(){
		List<TableDeJeu> tableDeJeus = tableDeJeuRepo.findAll();
		return tableDeJeus;
	}
	

	
	@GetMapping("/{id}")
	@JsonView(Views.ViewTableDeJeuDetail.class)
	public TableDeJeu findDetail(@PathVariable Long id) {
		TableDeJeu tableDeJeu = tableDeJeuRepo.findById(id).get();

		return tableDeJeu;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewTableDeJeu.class)
	public TableDeJeu create (@RequestBody TableDeJeu tableDeJeu) {
		return tableDeJeuRepo.save(tableDeJeu);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewTableDeJeu.class)
	public TableDeJeu update(@RequestBody TableDeJeu tableDeJeu,  @PathVariable Long id) {
		return tableDeJeuRepo.save(tableDeJeu);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		tableDeJeuRepo.deleteById(id);
	}
}
