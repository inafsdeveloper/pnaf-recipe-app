package guru.springframework.pnafrecipeapp.services;


import guru.springframework.pnafrecipeapp.commands.RecipeCommand;
import guru.springframework.pnafrecipeapp.domain.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);

    void deleteById(Long l);
}
