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

import projetShaan.shaan.boot.model.Race;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IRaceRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/race")
public class RaceController {

	@Autowired
	private IRaceRepository raceRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewRace.class)
	public List<Race>list(){
		List<Race> races = raceRepo.findAll();
		return races;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewRaceDetail.class)
	public Race find(@PathVariable Long id) {
		Race race = raceRepo.findById(id).get();
		return race;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewRace.class)
	public Race create (@RequestBody Race race) {
		return raceRepo.save(race);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewRace.class)
	public Race update(@RequestBody Race race, @PathVariable Long id) {
		return raceRepo.save(race);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		raceRepo.deleteById(id);
	}
}
