package com.argen;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args){
        double [] shrek = {-3,48,-9,71,-26,20,-49,3};
        double sum = 0;
        int counter = 0;
        boolean isFacedNegative = false;
        double avarageSum;

        for (double s:shrek) {
            if (s < 0){
                isFacedNegative = true;
        }else if (s > 0 && isFacedNegative){
                counter++;
                sum += s;

            }
        }
        avarageSum = sum / counter;
        System.out.println(avarageSum);
       }


    }
