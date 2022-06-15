package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.model.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {


    @GetMapping("/cars")
    public String getCars(Model model) {
        List<Car> cars = new ArrayList<>();
        cars = Car.addCars();
        model.addAttribute("cars1", cars);

        return "cars";

    }


//
//    @GetMapping("/cars/{count}")
//    public String getCarsByCount(@RequestParam("count") int count, Model model) {
//        ArrayList<Car> cars = carService.getCars(count);
//        model.addAttribute("carsCount", cars);
//        return "cars";
//
//    }

}

