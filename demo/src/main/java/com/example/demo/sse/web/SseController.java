package com.example.demo.sse.web;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

import static java.lang.Thread.*;

@Controller
public class SseController {

    @GetMapping(value="/push",produces="text/event-stream;charset=UTF-8")
    @ResponseBody
    public String push(){
        Random x =  new Random();

        try {
            // 每5秒向 页面推送消息
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 返回数据的特有格式
        return "data: testing 1,2,3 " + x.nextInt() + "\n\n";
    }

}
