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

import projetShaan.shaan.boot.model.MaitreDuJeu;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IMaitreDuJeuRepository;

@RestController
@RequestMapping("/mj")
public class MaitreDuJeuController {
	@Autowired
	private IMaitreDuJeuRepository maitreDuJeuRepo;

	@GetMapping("")
	@JsonView(Views.ViewMaitreDuJeu.class)
	public List<MaitreDuJeu>list(){
		List<MaitreDuJeu> maitresDuJeu = maitreDuJeuRepo.findAll();
		return maitresDuJeu;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewMaitreDuJeuDetail.class)
	public MaitreDuJeu find(@PathVariable Long id) {
		MaitreDuJeu maitreDuJeu = maitreDuJeuRepo.findById(id).get();
		return maitreDuJeu;
	}
	
	@PostMapping("")
	@JsonView(Views.ViewMaitreDuJeu.class)
	public MaitreDuJeu create (@RequestBody MaitreDuJeu MaitreDuJeu) {
		return maitreDuJeuRepo.save(MaitreDuJeu);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewMaitreDuJeu.class)
	public MaitreDuJeu update(@RequestBody MaitreDuJeu MaitreDuJeu, @PathVariable Long id) {
		return maitreDuJeuRepo.save(MaitreDuJeu);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		maitreDuJeuRepo.deleteById(id);
	}
}
