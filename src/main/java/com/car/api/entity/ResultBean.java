package com.car.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResultBean {

    private String code;

    private String messages;

    public ResultBean(String code, String messages) {
        this.code = code;
        this.messages = messages;
    }

    public String getCode() {
        return code;
    }

    public ResultBean setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessages() {
        return messages;
    }

    public ResultBean setMessages(String messages) {
        this.messages = messages;
        return this;
    }
}
