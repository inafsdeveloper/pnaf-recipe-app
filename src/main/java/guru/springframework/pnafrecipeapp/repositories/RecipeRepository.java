package guru.springframework.pnafrecipeapp.repositories;

import guru.springframework.pnafrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
