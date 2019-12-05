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

import projetShaan.shaan.boot.model.Caste;
import projetShaan.shaan.boot.model.Metier;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.ICasteRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/caste")
public class CasteController {

	@Autowired
	private ICasteRepository casteRepo;
	
	@GetMapping("/{id}/metiers")
	@JsonView(Views.ViewMetierFromCaste.class)
	public List<Metier> listmetiers(@PathVariable Long id){
		List<Metier> metiers = casteRepo.findAllMetier(id);
		return metiers;
	}
	
	
	
	@GetMapping("")
	@JsonView(Views.ViewCaste.class)
	public List<Caste>list(){
		List<Caste> castes = casteRepo.findAll();
		return castes;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewCaste.class)
	public Caste find(@PathVariable Long id){
		Caste caste = casteRepo.findById(id).get();
		return caste;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewCaste.class)
	public Caste create (@RequestBody Caste caste) {
		return casteRepo.save(caste);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewCaste.class)
	public Caste update(@RequestBody Caste caste,  @PathVariable Long id) {
		return casteRepo.save(caste);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		casteRepo.deleteById(id);
	}
	
	
}
