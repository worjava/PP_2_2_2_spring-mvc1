package web.dao;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
public class CarDAO {
    private List<Car> carList;

    {
        carList = new ArrayList<>(List.of(
                new Car(1, "Toyota Camry", 2022),
                new Car(2, "Honda Civic", 2021),
                new Car(3, "BMW X5", 2020),
                new Car(4, "Mercedes-Benz S-Class", 2023),
                new Car(5, "Toyota Land Cruiser", 2023)
        ));
    }

    public List<Car> showCar(int count) {
        if (count >= carList.size()) {
            return carList;
        } else if (count < 0) {
            return Collections.emptyList();
        } else {
            return carList.subList(0, count);
        }
    }
}
