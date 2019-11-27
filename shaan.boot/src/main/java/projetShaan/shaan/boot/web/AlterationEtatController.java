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

import projetShaan.shaan.boot.model.AlterationEtat;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IAlterationEtatRepository;

@RestController
@RequestMapping("/alterationEtat")
public class AlterationEtatController {

	@Autowired
	private IAlterationEtatRepository alterationEtatRepo;

	@GetMapping("")
	@JsonView(Views.ViewAlterationEtat.class)
	public List<AlterationEtat> list() {
		List<AlterationEtat> alterationEtats = alterationEtatRepo.findAll();
		return alterationEtats;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewAlterationEtat.class)
	public AlterationEtat find(@PathVariable Long id) {
		AlterationEtat alterationEtat = (AlterationEtat) alterationEtatRepo.findById(id).get();

		return alterationEtat;
	}
	
	@GetMapping("/{id}/detail")
	@JsonView(Views.ViewAlterationEtatDetail.class)
	public AlterationEtat findDetail(@PathVariable Long id) {
		AlterationEtat alterationEtat = alterationEtatRepo.findById(id).get();

		return alterationEtat;
	}

	@PostMapping("")
	@JsonView(Views.ViewAlterationEtat.class)
	public AlterationEtat create(@RequestBody AlterationEtat alterationEtat) {
		return alterationEtatRepo.save(alterationEtat);
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewAlterationEtat.class)
	public AlterationEtat update(@RequestBody AlterationEtat alterationEtat, @PathVariable Long id) {
		return alterationEtatRepo.save(alterationEtat);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		alterationEtatRepo.deleteById(id);
	}
}
