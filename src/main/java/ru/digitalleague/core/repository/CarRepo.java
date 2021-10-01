package ru.digitalleague.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.digitalleague.core.model.Car;

@Repository
public interface CarRepo extends CrudRepository<Car, Long> {
}
