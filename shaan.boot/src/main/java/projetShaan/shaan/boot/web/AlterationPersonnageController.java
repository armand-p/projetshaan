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

import com.fasterxml.jackson.annotation.JsonView;

import projetShaan.shaan.boot.model.AlterationPersonnage;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IAlterationPersonnageRepository;

@RequestMapping("/alterationPersonnage")
public class AlterationPersonnageController {
	@Autowired
	private IAlterationPersonnageRepository alterationPersonnageRepo;

	@GetMapping("")
	@JsonView(Views.ViewAlterationPersonnage.class)
	public List<AlterationPersonnage>list(){
		List<AlterationPersonnage> AlterationPersonnages = alterationPersonnageRepo.findAll();
		return AlterationPersonnages;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewAlterationPersonnageDetail.class)
	public AlterationPersonnage find(@PathVariable Long id) {
		AlterationPersonnage AlterationPersonnage = alterationPersonnageRepo.findById(id).get();
		return AlterationPersonnage;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewAlterationPersonnage.class)
	public AlterationPersonnage create (@RequestBody AlterationPersonnage AlterationPersonnage) {
		return alterationPersonnageRepo.save(AlterationPersonnage);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewAlterationPersonnage.class)
	public AlterationPersonnage update(@RequestBody AlterationPersonnage AlterationPersonnage, @PathVariable Long id) {
		return alterationPersonnageRepo.save(AlterationPersonnage);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		alterationPersonnageRepo.deleteById(id);
	}
}
