package com.employees.utility;

import java.util.Random;

/**
 * Created by JANVI on 03/12/2019.
 */
public class Util {

    public static String getRandomValue(){
        Random random = new Random();
        int radomInt = random.nextInt(100000);
        return Integer.toString(radomInt);
    }
}
