package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {

    public List<Car> getAllCars() {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "1970 Dodge Charger", 900));
        cars.add(new Car(2, "2014 W Motors Lykan HyperSport", 800));
        cars.add(new Car(3, "1969 Dodge Charger Daytona", 425));
        cars.add(new Car(4, "1965 Chevrolet Corvette Stingray", 360));
        cars.add(new Car(5, "2021 Toyota GR Supra", 382));
        return cars;
    }
}