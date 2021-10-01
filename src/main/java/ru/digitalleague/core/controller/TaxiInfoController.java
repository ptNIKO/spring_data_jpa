package ru.digitalleague.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.core.model.TaxiDriverInfo;
import ru.digitalleague.core.service.TaxiInfoService;

import java.util.Optional;

@RestController
@RequestMapping("/info")
public class TaxiInfoController {

    private final TaxiInfoService taxiInfoService;

    @Autowired
    public TaxiInfoController(TaxiInfoService taxiInfoService) {
        this.taxiInfoService = taxiInfoService;
    }

    @GetMapping("/get/{driverId}")
    public Optional<TaxiDriverInfo> getDriver(@PathVariable Long driverId) {
        Optional<TaxiDriverInfo> city = taxiInfoService.findById(driverId);
        return city;
    }

    @PostMapping("/add")
    public TaxiDriverInfo addDriver(@RequestBody TaxiDriverInfo record) {
        return taxiInfoService.save(record);
    }

    @DeleteMapping("/delete/{driverId}")
    public void deleteDriver(@PathVariable Long driverId) {
        taxiInfoService.deleteById(driverId);
        System.out.println("City is delete");
    }

    @PutMapping("/update")
    public TaxiDriverInfo updateDriver(@RequestBody TaxiDriverInfo record) {
        return taxiInfoService.save(record);
    }
}
