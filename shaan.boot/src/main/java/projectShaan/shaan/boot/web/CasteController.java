package projectShaan.shaan.boot.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;

import projetShaan.shaan.boot.model.Caste;
import projetShaan.shaan.boot.model.Views;
import projetShaan.shaan.boot.repository.ICasteRepository;

@RestController
@RequestMapping("/caste")
public class CasteController {

	@Autowired
	private ICasteRepository casteRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewCaste.class)
	public List<Caste>list(){
		List<Caste> castes = casteRepo.findAll();
		return castes;
	}
	
	
	
}
