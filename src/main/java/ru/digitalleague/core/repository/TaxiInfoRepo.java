package ru.digitalleague.core.repository;

import org.springframework.data.repository.CrudRepository;
import ru.digitalleague.core.model.TaxiDriverInfo;

public interface TaxiInfoRepo extends CrudRepository<TaxiDriverInfo, Long> {
}
