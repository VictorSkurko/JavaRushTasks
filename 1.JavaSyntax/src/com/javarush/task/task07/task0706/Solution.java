package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] list = new int[15];
        int summA = 0;
        int summB = 0;

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(r.readLine());
        }
        for (int i = 0; i < list.length; i++) {
            if (i % 2 == 0) {
                summA += list[i];
            } else {
                summB += list[i];
            }
        }
        if (summA > summB) {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        }
    }
}