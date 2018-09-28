package com.example.demo.service;

import com.example.demo.vo.Person;
import org.springframework.stereotype.Service;

@Service("loginService")
public class LoginServiceImpl implements LoginServcie {
    @Override
    public boolean login(Person p) {
        return false;
    }
}
