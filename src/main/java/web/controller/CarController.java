package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarService;

import java.util.List;

@Controller
public class CarController {

    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, Model model) {
        List<Car> result = null;
        if (count == null) {
            result = carService.addCars();
        } else if (count < 5) {
            result = carService.getSomeCars(count);
        } else if (count <= 5) {
            result = carService.addCars();
        }

        model.addAttribute("result", result);

        return "cars";

    }

}

