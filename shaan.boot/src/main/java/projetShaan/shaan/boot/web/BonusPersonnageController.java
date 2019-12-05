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

import projetShaan.shaan.boot.model.BonusPersonnage;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IBonusPersonnageRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/bonusPersonnage")
@JsonView(Views.ViewBonusPersonnage.class)
public class BonusPersonnageController {
	@Autowired
	private IBonusPersonnageRepository bonusPersonnageRepo;

	@GetMapping("")
	@JsonView(Views.ViewBonusPersonnage.class)
	public List<BonusPersonnage>list(){
		List<BonusPersonnage> BonusPersonnages = bonusPersonnageRepo.findAll();
		return BonusPersonnages;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewBonusPersonnageDetail.class)
	public BonusPersonnage find(@PathVariable Long id) {
		BonusPersonnage BonusPersonnage = bonusPersonnageRepo.findById(id).get();
		return BonusPersonnage;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewBonusPersonnage.class)
	public BonusPersonnage create (@RequestBody BonusPersonnage BonusPersonnage) {
		return bonusPersonnageRepo.save(BonusPersonnage);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewBonusPersonnage.class)
	public BonusPersonnage update(@RequestBody BonusPersonnage BonusPersonnage, @PathVariable Long id) {
		return bonusPersonnageRepo.save(BonusPersonnage);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		bonusPersonnageRepo.deleteById(id);
	}
}
