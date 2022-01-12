package guru.springframework.pnafrecipeapp.services;

import guru.springframework.pnafrecipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {
    public Set<UnitOfMeasureCommand> listAllUoms();
}
