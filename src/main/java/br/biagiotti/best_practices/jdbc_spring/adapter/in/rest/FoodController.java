package br.biagiotti.best_practices.jdbc_spring.adapter.in.rest;

import br.biagiotti.best_practices.jdbc_spring.adapter.in.rest.dto.Food;
import br.biagiotti.best_practices.jdbc_spring.domain.port.in.FoodUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    private final FoodUseCase foodUseCase;

    public FoodController(FoodUseCase foodUseCase) {
        this.foodUseCase = foodUseCase;
    }

    @GetMapping("/{food}")
    List<Food> getFood(@PathVariable String food){
        return foodUseCase.getOptionsOfFoodByName(food);
    }

}
