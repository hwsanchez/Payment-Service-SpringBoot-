package com.springbootproject.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

//        SpringApplication.run(StoreApplication.class, args);
        var orderService = new OrderService();
        orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println();
        orderService.setPaymentService(new StripePaymentService());
        orderService.placeOrder();
    }

}
