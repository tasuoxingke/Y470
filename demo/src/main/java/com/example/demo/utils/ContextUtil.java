
package com.example.demo.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

/**
 * 练习 自定义 工具类 获取 bean，支持3中方法获取bean，名称，类，名称+类
 */
@Service
public class ContextUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext=null;
    // 找了多个教程，返回泛型必须写成<T> T,才行，或者用Object，只用<T>是不行的
    public static <T> T getBean(String beanName){
        return (T) getApplicationContext().getBean(beanName);
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext=applicationContext;
    }
    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
    public static <T> T getBean(Class<T> clazz){
        return getApplicationContext().getBean(clazz);
    }
    public static <T> T getBean(String name,Class<T> clazz){
        return getApplicationContext().getBean(name, clazz);
    }
}

