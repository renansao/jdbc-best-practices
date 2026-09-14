package br.biagiotti.best_practices.jdbc_spring.adapter.out.repository;

import br.biagiotti.best_practices.jdbc_spring.adapter.in.rest.dto.Food;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.test.autoconfigure.JdbcTest;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.Assertions.assertThat;

@JdbcTest
@TestPropertySource(properties = {
    "spring.datasource.url=jdbc:h2:mem:testdb;MODE=PostgreSQL;DATABASE_TO_LOWER=TRUE;DEFAULT_NULL_ORDERING=HIGH",
    "spring.datasource.driverClassName=org.h2.Driver"
})
@Import(FoodRepository.class)
public class FoodRepositoryTest {

    @Autowired
    FoodRepository foodRepository;

    @Test
    void testReturnTodosTiposDeQueijo(){
        var result = foodRepository.getOptionsOfFoodByName("queijo");

        assertThat(result)
                .extracting(Food::foodName)
                .containsExactlyInAnyOrder("Queijo muçarela", "Queijo minas frescal");
    }
}
