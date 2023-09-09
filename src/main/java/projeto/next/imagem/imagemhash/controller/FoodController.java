package projeto.next.imagem.imagemhash.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import projeto.next.imagem.imagemhash.DTO.FoodReponseDTO;
import projeto.next.imagem.imagemhash.DTO.FoodRequestDTO;
import projeto.next.imagem.imagemhash.entities.Food;
import projeto.next.imagem.imagemhash.repositories.FoodRepository;

@RestController
@RequestMapping("food")
public class FoodController {
	
	@Autowired
	private FoodRepository repository;

	@PostMapping
	public void saveFood(@RequestBody FoodRequestDTO data){
		Food foodData = new Food(data);
		repository.save(foodData);
		return;

	}
	
	@GetMapping
	public List<FoodReponseDTO> getAll() {		
		
		List<FoodReponseDTO> foodList = repository.findAll().stream().map(FoodReponseDTO::new).toList();
		
		return foodList;
		
	}

}
