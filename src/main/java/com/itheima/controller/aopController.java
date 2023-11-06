package com.itheima.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class aopController {

    public void fun01(){
        System.out.println("github..");
        System.out.println("branch protection");
        System.out.println("day_03");
        System.out.println("day_03");
        System.out.println("day_03");
        System.out.println("day_03");
        System.out.println("day_03_05");
        System.out.println("day_03_06");
    }

    public void funTn(Integer n){
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j = i; j >= 1; j--) {
                sum += j;
            }
            System.out.println("sum of numbers from " + i + " to 1 is: " + sum);
        }
    }
}
