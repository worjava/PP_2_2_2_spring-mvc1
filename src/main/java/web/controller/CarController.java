package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.serviceCar.CarService;

@Controller
@RequestMapping("/cars") // корневой путь
public class CarController {

    private CarService carService;

    @Autowired //можно не писать
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("")
    public String showCar(@RequestParam(name = "count" ,defaultValue = "5") int index, Model model) {
        model.addAttribute("carList", carService.showCar(index));
        return "show";

    }
}
