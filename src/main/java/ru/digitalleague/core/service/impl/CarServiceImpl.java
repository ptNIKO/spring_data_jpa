package ru.digitalleague.core.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.core.model.Car;
import ru.digitalleague.core.repository.CarRepo;
import ru.digitalleague.core.service.CarService;

import java.util.Optional;


@Slf4j
@Service
@RequiredArgsConstructor
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepo carRepository;

    @Override
    public Optional<Car> findById(Long carId) {
        return carRepository.findById(carId);
    }

    @Override
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void deleteById(Long carId) {
        carRepository.deleteById(carId);
    }
}
