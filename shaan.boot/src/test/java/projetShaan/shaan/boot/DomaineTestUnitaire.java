package projetShaan.shaan.boot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import projetShaan.shaan.boot.model.Domaine;
import projetShaan.shaan.boot.repository.IDomaineRepository;

@SpringBootTest
public class DomaineTestUnitaire {
	
	@Autowired
	private IDomaineRepository domaineRepository;
	@Test
	void contextLoad() {
		Domaine technique = new Domaine();
		technique.setNom("Technique");
		technique.setElementLie("Objet");
		technique.setDescription(
				"traduit le savoir-faire, l'intelligence de la main et la maitrise de la matière. Monter, démonter pour réinventer et à nouveau construire.");
		technique = domaineRepository.save(technique);
		
		Domaine machine = new Domaine();
		machine = technique;
		machine.setElementLie("Méca");
		machine = domaineRepository.save(machine);
		
		domaineRepository.delete(machine);
	}
	
}
