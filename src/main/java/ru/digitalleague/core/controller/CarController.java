package ru.digitalleague.core.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.core.model.Car;
import ru.digitalleague.core.service.CarService;

import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/get/{carId}")
    public Optional<Car> getCar(@PathVariable Long carId) {
        Optional<Car> car = carService.findById(carId);
        return car;
    }

    @PostMapping("/add")
    public Car addCar(@RequestBody Car car) {
        return carService.save(car);
    }

    @DeleteMapping("/delete/{carId}")
    public void deleteCar(@PathVariable Long carId) {
        carService.deleteById(carId);
        System.out.println("Car is delete");
    }

    @PutMapping("/update")
    public Car updateCar(@RequestBody Car car) {
        return carService.save(car);
    }

}
