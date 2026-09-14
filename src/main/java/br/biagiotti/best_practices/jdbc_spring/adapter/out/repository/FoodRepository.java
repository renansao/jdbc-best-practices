package br.biagiotti.best_practices.jdbc_spring.adapter.out.repository;

import br.biagiotti.best_practices.jdbc_spring.adapter.in.rest.dto.Food;
import br.biagiotti.best_practices.jdbc_spring.domain.port.out.FoodRepositoryOutPort;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FoodRepository implements FoodRepositoryOutPort {

    private final JdbcClient jdbcClient;

    private static final String QUERY_FOOD = """
            SELECT *
            FROM food
            WHERE food_name ILIKE :food
            """;

    public FoodRepository (JdbcClient jdbcClient){
        this.jdbcClient = jdbcClient;
    }

    @Override
    public List<Food> getOptionsOfFoodByName(String name) {
        String pattern = "%" + name + "%";
        return this.jdbcClient.sql(QUERY_FOOD)
                .param("food", pattern)
                .query((rs, rowNum) -> new Food(
                        rs.getString("food_name"),
                        rs.getInt("grams"),
                        rs.getInt("calories"),
                        rs.getInt("carbs"),
                        rs.getInt("protein"),
                        rs.getInt("fats")
                )).list();
    }
}
