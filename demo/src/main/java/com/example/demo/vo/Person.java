package com.example.demo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Person {
    @JsonProperty("name")
    private String name ;
    @JsonProperty("age")
    private Integer age;
    //不JSON序列化年龄属性
    /*@JsonIgnore
    private Integer age;

    //格式化日期属性
    @JsonFormat(pattern = "yyyy年MM月dd日")*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name  +
                ", age=" + age +
                '}';
    }
}
