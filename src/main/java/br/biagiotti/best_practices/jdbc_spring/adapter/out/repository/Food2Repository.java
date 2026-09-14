package br.biagiotti.best_practices.jdbc_spring.adapter.out.repository;

import br.biagiotti.best_practices.jdbc_spring.adapter.in.rest.dto.Food;
import br.biagiotti.best_practices.jdbc_spring.domain.port.out.FoodRepositoryOutPort;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@Primary
public class Food2Repository implements FoodRepositoryOutPort {

    private final JdbcClient jdbcClient;

    private static final String QUERY_FOOD = """
            SELECT *
            FROM food
            WHERE food_name ILIKE :food
            """;

    public Food2Repository(JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

    @Override
    public Optional<List<Food>> getOptionsOfFoodByName(String name) {
        String pattern = "%" + name + "%";
        System.out.println("MappedQueySpec");
        List<Food> foodOptions = this.jdbcClient.sql(QUERY_FOOD)
                .param("food", pattern)
                .query(Food.class)
                .list();
        return Optional.of(foodOptions);
    }
}
