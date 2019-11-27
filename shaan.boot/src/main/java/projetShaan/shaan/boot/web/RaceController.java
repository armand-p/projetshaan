package projetShaan.shaan.boot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projetShaan.shaan.boot.model.Race;
import projetShaan.shaan.boot.repository.IRaceRepository;

@RestController
@RequestMapping("/race")
public class RaceController {

	@Autowired
	private IRaceRepository raceRepo;
	
	@GetMapping
	public List<Race>list(){
		List<Race> races = raceRepo.findAll();
		return races;
	}
}
