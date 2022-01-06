package com.foo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
       // Vehicle obj= (Vehicle)context.getBean("vehicle");
        /*Vehicle obj= (Vehicle)context.getBean("car");
        obj.drive();*/

       /*Tyre t= (Tyre)context.getBean("tyre");
        System.out.println(t);*/

        Car obj= (Car) context.getBean("car");
        obj.drive();

        //Car obj =new Car();
        //Bus obj=new Bus();
        // Vehicle obj=new Bus();
        System.out.println("This is demo for github changes");
    }
}
