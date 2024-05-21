package web.service;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private List<Car> cars = Arrays.asList(
            new Car("Model S", "Tesla", 2020),
            new Car("Civic", "Honda", 2019),
            new Car("Mustang", "Ford", 2018),
            new Car("Corolla", "Toyota", 2017),
            new Car("A4", "Audi", 2016)
    );

    public List<Car> getAllCars() {
        return cars;
    }

    public List<Car> getCars(int count) {
        return cars.subList(0, Math.min(count, cars.size()));
    }
}
