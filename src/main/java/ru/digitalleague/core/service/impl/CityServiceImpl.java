package ru.digitalleague.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.core.model.City;
import ru.digitalleague.core.repository.CityRepo;
import ru.digitalleague.core.service.CityService;

import java.util.Optional;


@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepo cityRepo;

    @Override
    public Optional<City> findById(Long cityId) {
        return cityRepo.findById(cityId);
    }

    @Override
    public City save(City city) {
        return cityRepo.save(city);
    }

    @Override
    public void deleteById(Long cityId) {
        cityRepo.deleteById(cityId);
    }
}
