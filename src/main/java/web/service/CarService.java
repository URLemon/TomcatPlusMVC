package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component(value = "carService")
public class CarService {
    @Autowired
    @Qualifier(value = "listCars")
    private List<Car> listCars;

    public List<Car> getCarsByCount(int count){
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}
