package com.car.api.controller;

import com.car.api.entity.CarBean;
import com.car.api.entity.ResultBean;
import com.car.api.service.CarSystemService;
import com.car.api.util.RetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/ParkAPI")
public class CarSystemController {

    @Autowired
    private CarSystemService carSystemService;

    @PostMapping("/vehicleEntry")
    public ResultBean vehicleEntry(@RequestBody CarBean car){
        System.out.println(car);
        try {
            carSystemService.saveVehicleEntryInfo(car.getInfo());
        }catch (Exception e){
            return RetResponse.makeErrRsp();
        }
        return RetResponse.makeOKRsp();
    }

    @PostMapping("/vehicleExit")
    public ResultBean vehicleExit(@RequestBody CarBean car){
        System.out.println(car);
        try {
            carSystemService.saveVehicleExitInfo(car.getInfo());
        }catch (Exception e){
            return RetResponse.makeErrRsp();
        }
        return RetResponse.makeOKRsp();
    }

    @PostMapping("/openGate")
    public ResultBean openGate(@RequestBody CarBean car){
        return RetResponse.makeOpenRsp();
    }
}
