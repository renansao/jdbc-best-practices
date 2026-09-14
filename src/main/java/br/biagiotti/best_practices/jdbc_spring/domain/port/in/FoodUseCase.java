package br.biagiotti.best_practices.jdbc_spring.domain.port.in;

import br.biagiotti.best_practices.jdbc_spring.adapter.in.rest.dto.Food;

import java.util.List;
import java.util.Optional;

public interface FoodUseCase {
    Optional<List<Food>> getOptionsOfFoodByName(String name);
}
