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

import projetShaan.shaan.boot.model.MotivationPersonnage;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IMotivationPersonnageRepository;

@RestController
@RequestMapping("/motivationPersonnage")
public class MotivationPersonnageController {
	
	@Autowired
	private IMotivationPersonnageRepository motivationPersonnageRepo;

	@GetMapping("")
	@JsonView(Views.ViewMotivationPersonnage.class)
	public List<MotivationPersonnage>list(){
		List<MotivationPersonnage> MotivationPersonnages = motivationPersonnageRepo.findAll();
		return MotivationPersonnages;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewMotivationPersonnageDetail.class)
	public MotivationPersonnage find(@PathVariable Long id) {
		MotivationPersonnage MotivationPersonnage = motivationPersonnageRepo.findById(id).get();
		return MotivationPersonnage;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewMotivationPersonnage.class)
	public MotivationPersonnage create (@RequestBody MotivationPersonnage MotivationPersonnage) {
		return motivationPersonnageRepo.save(MotivationPersonnage);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewMotivationPersonnage.class)
	public MotivationPersonnage update(@RequestBody MotivationPersonnage MotivationPersonnage, @PathVariable Long id) {
		return motivationPersonnageRepo.save(MotivationPersonnage);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		motivationPersonnageRepo.deleteById(id);
	}
}

