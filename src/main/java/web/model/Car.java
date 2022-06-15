package web.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private String model;
    private int maxSpeed;
    private int yearOfIssue;
    List<Car> cars;

    public static ArrayList<Car> addCars() {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("KIA Optima", 230, 2020));
        cars.add(new Car("BMW X5", 210, 2019));
        cars.add(new Car("Volvo V90", 240, 2021));
        cars.add(new Car("Skoda Octavia", 220, 2018));
        cars.add(new Car("Suzuki Jimny", 140, 2022));
        return cars;
    }

    public Car() {


    }



    public Car(String model, int maxSpeed, int yearOfIssue) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.yearOfIssue = yearOfIssue;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", yearOfIssue=" + yearOfIssue +
                '}';
    }
}



