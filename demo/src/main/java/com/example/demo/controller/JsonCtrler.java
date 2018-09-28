package com.example.demo.controller;

import com.example.demo.vo.Person;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import netscape.javascript.JSObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.net.URLDecoder;
import java.util.Map;

@Controller
public class JsonCtrler {
    @PostMapping(value="/json",produces = "application/json")
    public @ResponseBody  Object getJson( @RequestBody String params ){
        System.out.println("params:"+params);// name=22&age=2
        Person user =null;
        try {
        //String deParams = URLDecoder.decode(params,"utf-8");
          //  System.out.println("deParams:"+deParams);// {"name"="22","age":"3"}
            // 为什么会出现=
            // 本该是 params= %7b%22name%22%3a%2222%22%2c%22age%22%3a%223%22%7d
            // 都不对，是postman 没有设置对，post方式body 应该是raw
            // 而且也不需要 再次decode
        ObjectMapper mapper = new ObjectMapper();
        //mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true) ;
            // 炸了
            user = mapper.readValue(params, Person.class);
            System.out.println("user:"+user);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return user;

    }
}
