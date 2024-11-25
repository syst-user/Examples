package com.company.other;

import java.math.BigDecimal;
import java.security.SecureRandom;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

//        Object test = null;
//        String test2 = (String) test;
//        System.out.println(test2);
//
//
//        for (int x = 0; x < 100; x++) {
//            final String lowercase = "abcdefghijklmnopqrstuvwxyz";
//            final String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//            final String numbers = "0123456789";
//            String availableChars = numbers + lowercase + uppercase;
//
//            StringBuilder password = new StringBuilder();
//            int lengthPassword = 15;
//
//            SecureRandom random = new SecureRandom();
//            for (int i = 0; i < lengthPassword; i++) {
//                int index = random.nextInt(availableChars.length() - 1);
//                password.append(availableChars.charAt(index));
//            }
//            System.out.println(password);
//        }

//        System.out.println(new BigDecimal(0).add(new BigDecimal(0.25)));
//        System.out.println(new BigDecimal(new BigDecimal("2")));


        System.out.println(new Date());
        System.out.println(new Date(new Date().getTime()-(24*60*60*1000)));



    }
}
