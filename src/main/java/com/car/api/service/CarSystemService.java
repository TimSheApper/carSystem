package com.car.api.service;

import com.car.api.entity.Info;

public interface CarSystemService {

    void saveVehicleEntryInfo(Info info);

    void saveVehicleExitInfo(Info info);
}
