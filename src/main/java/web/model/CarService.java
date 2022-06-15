package web.model;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarService {
    static List<Car> cars;

    public CarService() {

    }

    public ArrayList<Car> addCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("KIA Optima", 230, 2020));
        cars.add(new Car("BMW X5", 210, 2019));
        cars.add(new Car("Volvo V90", 240, 2021));
        cars.add(new Car("Skoda Octavia", 220, 2018));
        cars.add(new Car("Suzuki Jimny", 140, 2022));
        return cars;
    }



    public List<Car> getSomeCars(int carCount) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("KIA Optima", 230, 2020));
        cars.add(new Car("BMW X5", 210, 2019));
        cars.add(new Car("Volvo V90", 240, 2021));
        cars.add(new Car("Skoda Octavia", 220, 2018));
        cars.add(new Car("Suzuki Jimny", 140, 2022));
        List<Car> cars1 = cars.stream()
                .limit(carCount)
                .collect(Collectors.toList());
        return cars1;
    }

}
