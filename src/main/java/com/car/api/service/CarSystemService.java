package com.car.api.service;

import com.car.api.entity.Info;

import java.util.List;

public interface CarSystemService {

    void saveVehicleEntryInfo(Info info);

    void saveVehicleExitInfo(Info info);
}
