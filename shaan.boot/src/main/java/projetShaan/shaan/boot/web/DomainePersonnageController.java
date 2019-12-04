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

import projetShaan.shaan.boot.model.DomainePersonnage;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IDomainePersonnageRepository;

@RestController
@RequestMapping("/domainePersonnage")
public class DomainePersonnageController {

	@Autowired
	private IDomainePersonnageRepository domainePersonnageRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewDomainePersonnage.class)
	public List<DomainePersonnage>list(){
		List<DomainePersonnage> domainePersonnages = domainePersonnageRepo.findAll();
		return domainePersonnages;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewDomainePersonnageDetail.class)
	public DomainePersonnage find(@PathVariable Long id){
		DomainePersonnage domainePersonnage = domainePersonnageRepo.findById(id).get();
		return domainePersonnage;
	}
	

	
	@PostMapping("")
	@JsonView(Views.ViewDomainePersonnage.class)
	public DomainePersonnage create (@RequestBody DomainePersonnage domainePersonnage) {
		return domainePersonnageRepo.save(domainePersonnage);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewDomainePersonnage.class)
	public DomainePersonnage update(@RequestBody DomainePersonnage domainePersonnage,  @PathVariable Long id) {
		return domainePersonnageRepo.save(domainePersonnage);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		domainePersonnageRepo.deleteById(id);
	}

}
