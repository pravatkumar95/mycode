package com.pks.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class WishMessageGenerator {


    @Autowired
    private LocalDateTime ldt;
    public WishMessageGenerator() {
        System.out.println("WishMessageGenerator:: 0-param construtor");
    }


    public  String  generateWishMessage(String user) {
        System.out.println(ldt);
        //get current hour
        int hour=ldt.getHour();  //24 hrs format
        //write b.logic
        if(hour<12)
            return "Good Morning::"+user;
        else if(hour<16)
            return "Good Afternoon::"+user;
        else if(hour<20)
            return "Good Evening::"+user;
        else
            return "Good Night::"+user;

    }
}
