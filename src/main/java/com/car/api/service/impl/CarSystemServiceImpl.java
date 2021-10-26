package com.car.api.service.impl;

import com.car.api.dao.CarSystemMapper;
import com.car.api.entity.Info;
import com.car.api.service.CarSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CarSystemServiceImpl implements CarSystemService {

    @Autowired
    private CarSystemMapper carSystemMapper;

    @Override
    @Transactional
    public void saveVehicleEntryInfo(Info info) {
        carSystemMapper.saveVehicleEntryInfo(info);
    }

    @Override
    @Transactional
    public void saveVehicleExitInfo(Info info) {
        carSystemMapper.saveVehicleExitInfo(info);
    }
}
