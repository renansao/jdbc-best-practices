package br.biagiotti.best_practices.jdbc_spring.adapter.in.rest.dto;

public record Food(String name,
                   Integer grams,
                   Integer calories,
                   Integer carbs,
                   Integer protein,
                   Integer fats){
}
