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

import projetShaan.shaan.boot.model.SpecialisationAcquis;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.ISpecialisationAcquisRepository;

@RestController
@RequestMapping("/specialisationAcquis")
public class SpecialisationAcquisController {

	@Autowired
	private ISpecialisationAcquisRepository specialisationAcquisRepo;

	@GetMapping("")
	@JsonView(Views.ViewSpecialisationAcquis.class)
	public List<SpecialisationAcquis> list() {
		List<SpecialisationAcquis> specialisationAcquis = specialisationAcquisRepo.findAll();

		return specialisationAcquis;
	}

	@GetMapping("/{id}")
	@JsonView(Views.ViewSpecialisationAcquisDetail.class)
	public SpecialisationAcquis find(@PathVariable Long id) {

		SpecialisationAcquis specialisationAcquis = specialisationAcquisRepo.findById(id).get();

		return specialisationAcquis;
	}

	@PostMapping("")
	@JsonView(Views.ViewSpecialisationAcquisDetail.class)
	public SpecialisationAcquis create(@RequestBody SpecialisationAcquis specialisationAcquis) {
		return specialisationAcquisRepo.save(specialisationAcquis);
	}

	@PutMapping("/{id}")
	@JsonView(Views.ViewSpecialisationAcquisDetail.class)
	public SpecialisationAcquis update(@RequestBody SpecialisationAcquis specialisationAcquis, @PathVariable Long id) {
		return specialisationAcquisRepo.save(specialisationAcquis);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		specialisationAcquisRepo.deleteById(id);
	}

}
