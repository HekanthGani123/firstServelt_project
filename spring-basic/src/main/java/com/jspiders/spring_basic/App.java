package com.jspiders.spring_basic;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspiders.spring_basic.javaconf.Order;
import com.jspiders.spring_basic.xmlconf.Passenger;
import com.jspiders.spring_basic.xmlconf.Ticket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-web.xml");
     // Ticket ticket = context.getBean(Ticket.class);
     // System.out.println(ticket);
       
       
      Passenger passenger = context.getBean(Passenger.class);
    
      System.out.println(passenger);
      
//      Order order = context.getBean(Order.class);
//      context.getBean(Order.class);
//     System.out.println(order);
        
    }
}
