package com.company;

import java.sql.Time;

public class Main {

    public static void main(String[] args) {
        long x;
        for(int i=0; i<5; i++) {
            x = System.currentTimeMillis();
            if (x % 3 == 0) {
                System.out.println("Nick ist dumm");
            }
            if (x % 2 == 0) {
                System.out.println("Git ist dumm");
            }
            if (x % 7 == 0) {
                System.out.println("Sebastian ist dumm");
            }
        }


    }
}
