package web.serviceCar;

import org.springframework.stereotype.Service;
import web.dao.CarDAO;
import web.models.Car;

import java.util.Collections;
import java.util.List;


@Service
public class CarService {
    private final CarDAO carDAO;

    public CarService(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    public List<Car> showCar(int count) {
     return    carDAO.showCar(count);
    }
}

