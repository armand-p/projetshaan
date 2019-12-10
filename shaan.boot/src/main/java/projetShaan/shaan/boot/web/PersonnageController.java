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

import projetShaan.shaan.boot.model.AlterationPersonnage;
import projetShaan.shaan.boot.model.BonusPersonnage;
import projetShaan.shaan.boot.model.DomainePersonnage;
import projetShaan.shaan.boot.model.MotivationPersonnage;
import projetShaan.shaan.boot.model.Personnage;
import projetShaan.shaan.boot.model.PouvoirPersonnage;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.IAlterationPersonnageRepository;
import projetShaan.shaan.boot.repository.IBonusPersonnageRepository;
import projetShaan.shaan.boot.repository.IDomainePersonnageRepository;
import projetShaan.shaan.boot.repository.IMotivationPersonnageRepository;
import projetShaan.shaan.boot.repository.IPersonnageRepository;
import projetShaan.shaan.boot.repository.IPouvoirPersonnageRepository;
@CrossOrigin("*")
@RestController
@RequestMapping("/personnage")
public class PersonnageController {
	@Autowired
	private IPersonnageRepository personnageRepo;
	
	@Autowired
	private IBonusPersonnageRepository bonusPersoRepo;
	
	@Autowired
	private IDomainePersonnageRepository domainePersoRepo;
	
	@Autowired
	private IPouvoirPersonnageRepository pouvoirPersoRepo;
	
	@Autowired
	private IMotivationPersonnageRepository motivationPersoRepo;
	
	@Autowired
	private IAlterationPersonnageRepository AlterationPersoRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewPersonnage.class)
	public List<Personnage>list(){
		List<Personnage> personnages = personnageRepo.findAll();
		return personnages;
	}
	
	
	@GetMapping("/onlyPerso")
	@JsonView(Views.ViewPersonnage.class)
	public List<Personnage>findAllPersonnage(){
		List<Personnage> personnages = personnageRepo.findAllPersonnage();
		return personnages;
	}
	
	@GetMapping("/noPartie")
	@JsonView(Views.ViewPersonnagePartie.class)
	public List<Personnage>findAllPersonnagenopartie(){
		List<Personnage> personnages = personnageRepo.findAllPersonnageWithNoPartie();
		return personnages;
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewPersonnageDetail.class)
	public Personnage find(@PathVariable Long id){
		Personnage personnage = personnageRepo.findById(id).get();
		return personnage;
	}
	
	

	
	@GetMapping("/{id}/bonusPerso")
	@JsonView(Views.ViewBonusPersonnageDetail.class)
	public List<BonusPersonnage> findBonusPerso(@PathVariable Long id) {
		List<BonusPersonnage> BonusPersonnages = bonusPersoRepo.findByPersonnage(id);

		return BonusPersonnages;
	}
	
	@GetMapping("/{id}/domaine")
	@JsonView(Views.ViewDomainePersonnage.class)
	public List<DomainePersonnage> findDomaine(@PathVariable Long id) {
		List<DomainePersonnage> domainePersonnages = domainePersoRepo.findByPersonnage(id);

		return domainePersonnages;
	}
	
	@GetMapping("/{id}/alteration")
	@JsonView(Views.ViewAlterationPersonnageDetail.class)
	public List<AlterationPersonnage> findAlteration(@PathVariable Long id) {
		List<AlterationPersonnage> alterationPersonnages = AlterationPersoRepo.findByPersonnage(id);

		return alterationPersonnages;
	}
	
	@GetMapping("/{id}/pouvoir")
	@JsonView(Views.ViewPouvoirPersonnageDetail.class)
	public List<PouvoirPersonnage> findPouvoir(@PathVariable Long id) {
		List<PouvoirPersonnage> pouvoirPersonnages = pouvoirPersoRepo.findByPersonnage(id);

		return pouvoirPersonnages;
	}
	
	@GetMapping("/{id}/motivation")
	@JsonView(Views.ViewMotivationPersonnageDetail.class )
	public List<MotivationPersonnage> findMotivation(@PathVariable Long id) {
		List<MotivationPersonnage> motivationPersonnages = motivationPersoRepo.findByPersonnage(id);

		return motivationPersonnages;
	}

	
	@PostMapping("")
	@JsonView(Views.ViewPersonnageDetail.class)
	public Personnage create (@RequestBody Personnage personnage) {
		return personnageRepo.save(personnage);
	}
	
	@PutMapping("/{id}")
	@JsonView(Views.ViewPersonnageDetail.class)
	public Personnage update(@RequestBody Personnage personnage,  @PathVariable Long id) {
		return personnageRepo.save(personnage);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		personnageRepo.deleteById(id);
	}
}
