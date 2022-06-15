package web.model;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {
    List<Car> cars;

    public CarService() {
        this.cars = cars;

    }

    public static List <Car> doCars(){
        List<Car> cars = null;
        cars.add(new Car("KIA Optima", 230, 2020));
        cars.add(new Car("BMW X5", 210, 2019));
        cars.add(new Car("Volvo V90", 240, 2021));
        cars.add(new Car("Skoda Octavia", 220, 2018));
        cars.add(new Car("Suzuki Jimny", 140, 2022));
        return cars;
    }


    public ArrayList<Car> getCarsByCount(int countCars){
        ArrayList<Car> newCars = new ArrayList<>();
        for (int i = 0; i < countCars; i++) {
            newCars.add(cars.get(i));
        }
        return newCars;
    }

}
