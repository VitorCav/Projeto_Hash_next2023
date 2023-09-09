package projeto.next.imagem.imagemhash.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import projeto.next.imagem.imagemhash.entities.Food;

public interface FoodRepository extends JpaRepository<Food, Long> {

}
