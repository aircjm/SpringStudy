package com.ioc.spring1;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <Description> <br>
 *
 * @author chenjiaming<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2016/2/23 <br>
 */
public class HelloWorldTest {

    public static void main(String[] args) {
        /*通过路径加载Spring的配置文件，获取上下文应用*/
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/spring1/beans.xml");


        /*通过Bean的id获取Bean*/
        HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloWorld");

        System.out.println(helloWorld.toString());
    }

}