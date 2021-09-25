package guru.springframework.pnafrecipeapp.services;


import guru.springframework.pnafrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
