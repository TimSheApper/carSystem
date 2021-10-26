package com.car.api.util;

import com.car.api.entity.ResultBean;

public class RetResponse {
    private final static String SUCCESS_CODE = "10001";
    private final static String SUCCESS_MESSAGES = "SUCCESS";

    private final static String ERR_CODE = "40005";
    private final static String ERR_MESSAGES = "处理失败";

    private final static String OPEN_CODE = "10010";
    private final static String OPEN_MESSAGES = "OPEN";

    public static ResultBean makeOKRsp() {
        return new ResultBean().setCode(RetResponse.SUCCESS_CODE).setMessages(RetResponse.SUCCESS_MESSAGES);
    }

    public static ResultBean makeErrRsp() {
        return new ResultBean().setCode(RetResponse.ERR_CODE).setMessages(RetResponse.ERR_MESSAGES);
    }

    public static ResultBean makeOpenRsp() {
        return new ResultBean().setCode(RetResponse.OPEN_CODE).setMessages(RetResponse.OPEN_MESSAGES);
    }

    public static ResultBean makeRsp(String code, String msg) {
        return new ResultBean().setCode(code).setMessages(msg);
    }
}
