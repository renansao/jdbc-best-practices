package br.biagiotti.best_practices.jdbc_spring.domain.port.in;

import br.biagiotti.best_practices.jdbc_spring.adapter.in.rest.dto.Food;

import java.util.List;

public interface FoodUseCase {
    List<Food> getOptionsOfFoodByName(String name);
}
