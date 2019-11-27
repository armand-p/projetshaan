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

import projetShaan.shaan.boot.model.Metier;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IMetierRepository;

@RestController
@RequestMapping("/metier")
public class MetierController {

	@Autowired
	private IMetierRepository metierRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewMetier.class)
	public List<Metier> list() {
		List<Metier> metiers = metierRepo.findAll();
		
		return metiers;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewMetierDetail.class)
	public Metier find(@PathVariable Long id) {
		
		Metier metier = metierRepo.findById(id).get();
		
		return metier;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewMetier.class)
	public Metier create(@RequestBody Metier metier) {
		return metierRepo.save(metier);
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewMetier.class)
	public Metier update(@RequestBody Metier metier, @PathVariable Long id) {
		return metierRepo.save(metier);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		metierRepo.deleteById(id);
	}
	
}
