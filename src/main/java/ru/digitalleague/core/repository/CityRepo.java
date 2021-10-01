package ru.digitalleague.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.digitalleague.core.model.Car;
import ru.digitalleague.core.model.City;

@Repository
public interface CityRepo extends CrudRepository<City, Long> {
}
