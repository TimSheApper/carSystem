package com.car.api;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

@SpringBootTest
class ApiApplicationTests {

    @Test
    void contextLoads() {
        String imgPath = "I:\\photo\\雪山.jpg";
        byte[] data = null;
        // 读取图片字节数组
        try {
            InputStream in = new FileInputStream(imgPath);
            data = new byte[in.available()];
            in.read(data);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        // 返回Base64编码过的字节数组字符串
        System.out.println("本地图片转换Base64:" + encoder.encode(Objects.requireNonNull(data)));
        jm(encoder.encode(Objects.requireNonNull(data)));
    }

    public static void jm(String imgdata){
        BASE64Decoder decoder = new BASE64Decoder();
        byte[] data = new byte[0];
        try {
            data = decoder.decodeBuffer(imgdata);

            for(int i =0 ; i < data.length ;i++) {
                if(data[i] < 0) {
                    data[i] += 256;
                }
            }
            //写入保存成jpeg文件
            FileOutputStream fos = new FileOutputStream("I:\\photo\\雪山1.jpg");
            fos.write(data);
            fos.flush();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
