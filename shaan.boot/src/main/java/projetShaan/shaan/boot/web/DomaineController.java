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

import projetShaan.shaan.boot.model.Domaine;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IDomaineRepository;

@RestController
@RequestMapping("/domaine")
public class DomaineController {
	
	@Autowired
	private IDomaineRepository domaineRepo;

	@GetMapping("")
	@JsonView(Views.ViewDomaine.class)
	public List<Domaine>list(){
		List<Domaine> Domaines = domaineRepo.findAll();
		return Domaines;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewDomaine.class)
	public Domaine find(@PathVariable Long id) {
		Domaine Domaine = domaineRepo.findById(id).get();
		return Domaine;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewDomaine.class)
	public Domaine create (@RequestBody Domaine Domaine) {
		return domaineRepo.save(Domaine);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewDomaine.class)
	public Domaine update(@RequestBody Domaine Domaine, @PathVariable Long id) {
		return domaineRepo.save(Domaine);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		domaineRepo.deleteById(id);
	}
}
