package ru.digitalleague.core.service;


import ru.digitalleague.core.model.Car;
import ru.digitalleague.core.model.City;

import java.util.Optional;

public interface CityService {

    Optional<City> findById(Long cityId);

    City save(City city);

    void deleteById(Long cityId);
}
