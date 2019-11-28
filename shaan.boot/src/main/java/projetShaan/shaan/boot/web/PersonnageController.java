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

import projetShaan.shaan.boot.model.Personnage;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IPersonnageRepository;

@RestController
@RequestMapping("/personnage")
public class PersonnageController {
	@Autowired
	private IPersonnageRepository personnageRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewPersonnage.class)
	public List<Personnage>list(){
		List<Personnage> personnages = personnageRepo.findAll();
		return personnages;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPersonnage.class)
	public Personnage find(@PathVariable Long id){
		Personnage personnage = personnageRepo.findById(id).get();
		return personnage;
	}
	
	@GetMapping("/{id}/detail")
	@JsonView(Views.ViewPersonnageDetail.class)
	public Personnage findDetail(@PathVariable Long id) {
		Personnage personnage = personnageRepo.findById(id).get();

		return personnage;
	}

	
	@PostMapping("")
	@JsonView(Views.ViewPersonnage.class)
	public Personnage create (@RequestBody Personnage personnage) {
		return personnageRepo.save(personnage);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewPersonnage.class)
	public Personnage update(@RequestBody Personnage personnage,  @PathVariable Long id) {
		return personnageRepo.save(personnage);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		personnageRepo.deleteById(id);
	}
}
