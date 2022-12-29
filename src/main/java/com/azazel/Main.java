package com.azazel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        /*SpringBootApplication[] sba = Main.class.getAnnotationsByType(SpringBootApplication.class);
        for (SpringBootApplication s : sba) {
            System.out.println(Arrays.toString(s.exclude()));
            System.out.println(Arrays.toString(new String[1]));
        }*/
        SpringApplication.run(Main.class, args);
    }
}
