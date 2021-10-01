package ru.digitalleague.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.core.model.City;
import ru.digitalleague.core.service.CityService;

import java.util.Optional;

@RestController
@RequestMapping("/city")
public class CityController {

    private final CityService cityService;

    @Autowired
    public CityController(CityService cityService) {
        this.cityService = cityService;
    }


    @GetMapping("/get/{cityId}")
    public Optional<City> getCity(@PathVariable Long cityId) {
        Optional<City> city = cityService.findById(cityId);
        return city;
    }

    @PostMapping("/add")
    public City addCity(@RequestBody City city) {
        return cityService.save(city);
    }

    @DeleteMapping("/delete/{cityId}")
    public void deleteCity(@PathVariable Long cityId) {
        cityService.deleteById(cityId);
        System.out.println("City is delete");
    }

    @PutMapping("/update")
    public City updateCar(@RequestBody City city) {
        return cityService.save(city);
    }
}
