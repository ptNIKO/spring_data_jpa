package ru.digitalleague.core.model;

import lombok.*;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name = "taxi_driver_info")
@NoArgsConstructor
@Getter
@Setter
public class TaxiDriverInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "driver_id")
    private Long driverId;

    /**
     * Фамилия.
     */
    @Column(name = "last_name")
    private String lastName;

    /**
     * Имя.
     */
    @Column(name = "first_name")
    private String firstName;

    /**
     * Отчество.
     */
    /*private String middleName;*/

    /**
     * Уровень.
     */
    private int level;

    /**
     * Модель авто (должна быть ENUM).
     */
    @Column(name = "car_model")
    private String carModel;

    /**
     * Дата создания.
     */
    @Column(name = "create_dttm")
    private OffsetDateTime createDttm;
}
