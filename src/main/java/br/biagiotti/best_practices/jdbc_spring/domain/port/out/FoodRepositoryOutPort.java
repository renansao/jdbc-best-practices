package br.biagiotti.best_practices.jdbc_spring.domain.port.out;

import br.biagiotti.best_practices.jdbc_spring.adapter.in.rest.dto.Food;

import java.util.List;

public interface FoodRepositoryOutPort {

    List<Food> getOptionsOfFoodByName(String name);
}
