package com.car.api.entity;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class Car {

    @ApiModelProperty("车辆类型")
    private String cardType;

    @ApiModelProperty("月租费标准：元")
    private String monthPay;

}
