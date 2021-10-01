package ru.digitalleague.core.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import ru.digitalleague.core.model.TaxiDriverInfo;
import ru.digitalleague.core.repository.TaxiInfoRepo;
import ru.digitalleague.core.service.TaxiInfoService;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
@RequiredArgsConstructor
public class TaxiInfoServiceImpl implements TaxiInfoService {

    @Autowired
    private TaxiInfoRepo taxiInfoMapper;

    @Override
    public Optional<TaxiDriverInfo> findById(Long driverId) {
        return taxiInfoMapper.findById(driverId);
    }

    @Override
    public TaxiDriverInfo save(TaxiDriverInfo record) {
        return taxiInfoMapper.save(record);
    }

    @Override
    public void deleteById(Long driverId) {
        taxiInfoMapper.deleteById(driverId);
    }
}
