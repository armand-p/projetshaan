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

import projetShaan.shaan.boot.model.Specialisation;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.ISpecialisationRepository;


@RestController
@RequestMapping("/specialisation")
public class SpecialisationController {
	

		@Autowired
		private ISpecialisationRepository specialisationRepo;

		@GetMapping("")
		@JsonView(Views.ViewSpecialisation.class)
		public List<Specialisation> list() {
			List<Specialisation> specialisations = specialisationRepo.findAll();
			return specialisations;
		}

		@GetMapping("/{id}")
		@JsonView(Views.ViewSpecialisation.class)
		public Specialisation find(@PathVariable Long id) {
			Specialisation specialisation = (Specialisation) specialisationRepo.findById(id).get();

			return specialisation;
		}
		
		@GetMapping("/{id}/detail")
		@JsonView(Views.ViewSpecialisationDetail.class)
		public Specialisation findDetail(@PathVariable Long id) {
			Specialisation specialisation = specialisationRepo.findById(id).get();

			return specialisation;
		}

		@PostMapping("")
		@JsonView(Views.ViewSpecialisation.class)
		public Specialisation create(@RequestBody Specialisation specialisation) {
			return specialisationRepo.save(specialisation);
		}

		@PutMapping("/{id}")
		@JsonView(Views.ViewSpecialisation.class)
		public Specialisation update(@RequestBody Specialisation specialisation, @PathVariable Long id) {
			return specialisationRepo.save(specialisation);
		}

		@DeleteMapping("/{id}")
		public void delete(@PathVariable Long id) {
			specialisationRepo.deleteById(id);
		}
}
