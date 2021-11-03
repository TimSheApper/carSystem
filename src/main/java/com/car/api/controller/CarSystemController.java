package com.car.api.controller;

import com.car.api.entity.CarBean;
import com.car.api.entity.ResultBean;
import com.car.api.service.CarSystemService;
import com.car.api.util.RetResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ParkAPI")
public class CarSystemController {

    @Autowired
    private CarSystemService carSystemService;

    private static final Logger log = LoggerFactory.getLogger(CarSystemController.class);

    @PostMapping("/receiver")
    public ResultBean UnifiedReceiver(@RequestBody CarBean car){
        try {
            log.info("接收信息："+car.toString());
            switch(car.getCommand()){
                case "cmdInParking" :
                    vehicleEntry(car);
                    break;
                case "cmdPreOutParking" :
                    return openGate(car);
                case "cmdOutParking" :
                    vehicleExit(car);
                    break;
                default :

            }
            return RetResponse.makeOKRsp();
        }catch (Exception e){
            return RetResponse.makeErrRsp();
        }
    }

    public void vehicleEntry(CarBean car){
        carSystemService.saveVehicleEntryInfo(car.getInfo());
    }

    public void vehicleExit(CarBean car){
        carSystemService.saveVehicleExitInfo(car.getInfo());
    }

    public ResultBean openGate(CarBean car){
        return RetResponse.makeOpenRsp();
    }
}
