package com.car.api.entity;

import lombok.Data;
import org.json.JSONObject;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Data
@Component
public class CarBean {
    private String command;//功能模块
    private String parkingStr;//车场编号

    private Info info;

}
