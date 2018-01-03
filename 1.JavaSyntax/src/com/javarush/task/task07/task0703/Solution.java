package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String[] strlist = new String[10];
        int[] numlist = new int[10];

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strlist[i] = r.readLine();
        }

        for (int i = 0; i < 10; i++) {
            numlist[i] = strlist[i].length() ;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(numlist[i]);
        }
    }
}