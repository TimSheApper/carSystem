package com.car.api.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Info {
    private String plateNo;//车牌号
    private String cardType;//车辆类型
    private String cardNo;//车辆编号
    private String inTime;//进场时间
    private String outTime;//出场时间
    private String inChannel;//入场车道
    private String inType;//入场类型
    private String inPic;//入场图片
    private String outChannel;//出场车道
    private String outType;//出场类型
    private String outUser;//出场收费员
    private String outPic;//出场图片
    private String receive;//应收金额
}
