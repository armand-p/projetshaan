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

import projetShaan.shaan.boot.model.Pouvoir;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IPouvoirRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/pouvoir")
public class PouvoirController {

	@Autowired
	private IPouvoirRepository pouvoirRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewPouvoir.class)
	public List<Pouvoir> list() {
		List<Pouvoir> pouvoirs = pouvoirRepo.findAll();
		
		return pouvoirs;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPouvoirDetail.class)
	public Pouvoir find(@PathVariable Long id) {
		
		Pouvoir pouvoir = pouvoirRepo.findById(id).get();
		
		return pouvoir;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewPouvoirDetail.class)
	public Pouvoir create(@RequestBody Pouvoir pouvoir) {
		return pouvoirRepo.save(pouvoir);
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewPouvoirDetail.class)
	public Pouvoir update(@RequestBody Pouvoir pouvoir, @PathVariable Long id) {
		return pouvoirRepo.save(pouvoir);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		pouvoirRepo.deleteById(id);
	}

}