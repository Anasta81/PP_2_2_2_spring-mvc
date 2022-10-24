package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    List<Car> cars = new ArrayList<>(List.of(
            new Car("black", "Audi", 3),
            new Car("pink", "BMW", 17),
            new Car("yellow", "Submarine", 56),
            new Car("white","Kia",5),
            new Car("purple", "Deep", 54)));


    @Override
    public List<Car> getCars(int count) {

        List<Car> resultCars = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            if (i >= cars.size()) {
                break;
            }
            resultCars.add(cars.get(i));
        }
        return resultCars;
    }
}
