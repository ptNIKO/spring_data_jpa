package ru.digitalleague.core.service;

import ru.digitalleague.core.model.City;
import ru.digitalleague.core.model.TaxiDriverInfo;
import java.util.Optional;

public interface TaxiInfoService {

    Optional<TaxiDriverInfo> findById(Long driverId);

    TaxiDriverInfo save(TaxiDriverInfo record);

    void deleteById(Long driverId);
}
