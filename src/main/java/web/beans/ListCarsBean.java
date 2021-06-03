package web.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Configuration
public class ListCarsBean {

    @Bean(name = "listCars")
    public List<Car> listCars(){
        return Arrays.asList(
                new Car("A", 12, "green"),
                new Car("B", 120, "green"),
                new Car("D", 1, "red"),
                new Car("A", 112, "yellow"),
                new Car("C", 132, "green")
        );
    }
}
