package com.itheima.controller;

public class day_04 {

    public static void main(String[] args) {
        int num = getNum(10);
    }
    public static int getNum(int n){
        int b = 0;
        for (int i = 0; i < n; i++) {
            b+=i;
        }
        return b;
    }

    public void day05(){
        System.out.println("day-05");
    }
}
