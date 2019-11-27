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

import projetShaan.shaan.boot.model.Acquis;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IAcquisRepository;

@RestController
	@RequestMapping("/acquis")
public class AcquisController {
	
		

			@Autowired
			private IAcquisRepository acquisRepo;

			@GetMapping("")
			@JsonView(Views.ViewAcquis.class)
			public List<Acquis> list() {
				List<Acquis> acquiss = acquisRepo.findAll();
				return acquiss;
			}

			@GetMapping("/{id}")
			@JsonView(Views.ViewAcquis.class)
			public Acquis find(@PathVariable Long id) {
				Acquis acquis = (Acquis) acquisRepo.findById(id).get();

				return acquis;
			}
			
			@GetMapping("/{id}/detail")
			@JsonView(Views.ViewAcquisDetail.class)
			public Acquis findDetail(@PathVariable Long id) {
				Acquis acquis = acquisRepo.findById(id).get();

				return acquis;
			}

			@PostMapping("")
			@JsonView(Views.ViewAcquis.class)
			public Acquis create(@RequestBody Acquis acquis) {
				return acquisRepo.save(acquis);
			}

			@PutMapping("/{id}")
			@JsonView(Views.ViewAcquis.class)
			public Acquis update(@RequestBody Acquis acquis, @PathVariable Long id) {
				return acquisRepo.save(acquis);
			}

			@DeleteMapping("/{id}")
			public void delete(@PathVariable Long id) {
				acquisRepo.deleteById(id);
			}
	}
