package projectShaan.shaan.boot.web;

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

import projetShaan.shaan.boot.model.Peuple;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IPeupleRepository;

@RestController
@RequestMapping("/peuple")
public class PeupleController {

	@Autowired
	private IPeupleRepository peupleRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewPeuple.class)
	public List<Peuple> list() {
		List<Peuple> peuples = peupleRepo.findAll();
		
		return peuples;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPeupleDetail.class)
	public Peuple find(@PathVariable Long id) {
		
		Peuple peuple = peupleRepo.findById(id).get();
		
		return peuple;
	}
	
	@PostMapping("")
	public Peuple create(@RequestBody Peuple peuple) {
		return peupleRepo.save(peuple);
	}

	@PutMapping("/{id}")
	public Peuple update(@RequestBody Peuple peuple, @PathVariable Long id) {
		return peupleRepo.save(peuple);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		peupleRepo.deleteById(id);
	}

}
