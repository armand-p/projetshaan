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

import projetShaan.shaan.boot.model.PouvoirPersonnage;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IPouvoirPersonnageRepository;

@RestController
@RequestMapping("/pouvoirPersonnage")
public class PouvoirPersonnageController {

	@Autowired
	private IPouvoirPersonnageRepository pouvoirPersonnageRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewPouvoirPersonnage.class)
	public List<PouvoirPersonnage> list() {
		List<PouvoirPersonnage> pouvoirPersonnages = pouvoirPersonnageRepo.findAll();
		
		return pouvoirPersonnages;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPouvoirPersonnageDetail.class)
	public PouvoirPersonnage find(@PathVariable Long id) {
		
		PouvoirPersonnage pouvoirPersonnage = pouvoirPersonnageRepo.findById(id).get();
		
		return pouvoirPersonnage;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewPouvoirPersonnageDetail.class)
	public PouvoirPersonnage create(@RequestBody PouvoirPersonnage pouvoirPersonnage) {
		return pouvoirPersonnageRepo.save(pouvoirPersonnage);
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewPouvoirPersonnageDetail.class)
	public PouvoirPersonnage update(@RequestBody PouvoirPersonnage pouvoirPersonnage, @PathVariable Long id) {
		return pouvoirPersonnageRepo.save(pouvoirPersonnage);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		pouvoirPersonnageRepo.deleteById(id);
	}

}
