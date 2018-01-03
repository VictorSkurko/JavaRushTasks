package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[20];
        int[] subnum1 = new int[10];
        int[] subnum2 = new int[10];
        int j = 0;

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(r.readLine());
        }

        for (int i = 0; i < (num.length)/2; i++) {
            subnum1[i] = num[i];
//            System.out.println(subnum1[i]);
        }

        for (int i = 10; i < num.length; i++) {
            subnum2[j] = num[i];
            j++;
        }
        for (int i = 0; i < subnum2.length; i++) {
            System.out.println(subnum2[i]);
        }
    }
}