package com.spring.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Programe started" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Airtel air =context.getBean("Airtel",Airtel.class);
        air.getService();
    }
}
