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

import projetShaan.shaan.boot.model.Motivation;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IMotivationRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/motivation")
public class MotivationController {
	
	@Autowired
	private IMotivationRepository motivationRepo;

	@GetMapping("")
	@JsonView(Views.ViewMotivation.class)
	public List<Motivation>list(){
		List<Motivation> Motivations = motivationRepo.findAll();
		return Motivations;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewMotivationDetail.class)
	public Motivation find(@PathVariable Long id) {
		Motivation Motivation = motivationRepo.findById(id).get();
		return Motivation;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewMotivation.class)
	public Motivation create (@RequestBody Motivation Motivation) {
		return motivationRepo.save(Motivation);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewMotivation.class)
	public Motivation update(@RequestBody Motivation Motivation, @PathVariable Long id) {
		return motivationRepo.save(Motivation);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		motivationRepo.deleteById(id);
	}
}

