package ru.digitalleague.core.service;

import ru.digitalleague.core.model.Car;

import java.util.Optional;

public interface CarService {

    Optional<Car> findById(Long carId);

    Car save(Car car);

    void deleteById(Long carId);

}
