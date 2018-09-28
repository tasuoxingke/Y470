package com.example.demo.sse.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexCtrller {
            @GetMapping("/")
            public  String index(){
                return "sse";
            }
}
