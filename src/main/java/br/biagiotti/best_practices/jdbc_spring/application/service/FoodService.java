package br.biagiotti.best_practices.jdbc_spring.application.service;

import br.biagiotti.best_practices.jdbc_spring.adapter.in.rest.dto.Food;
import br.biagiotti.best_practices.jdbc_spring.domain.port.in.FoodUseCase;
import br.biagiotti.best_practices.jdbc_spring.domain.port.out.FoodRepositoryOutPort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FoodService implements FoodUseCase {

    private final FoodRepositoryOutPort foodRepositoryOutPort;

    public FoodService(FoodRepositoryOutPort foodRepositoryOutPort) {
        this.foodRepositoryOutPort = foodRepositoryOutPort;
    }

    @Override
    public Optional<List<Food>> getOptionsOfFoodByName(String name) {
        return this.foodRepositoryOutPort.getOptionsOfFoodByName(name);
    }
}
