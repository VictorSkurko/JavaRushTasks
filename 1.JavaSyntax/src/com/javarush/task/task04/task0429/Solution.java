package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[3];
        int positiv = 0, negativ = 0;

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        num[0] = Integer.parseInt(r.readLine());
        num[1] = Integer.parseInt(r.readLine());
        num[2] = Integer.parseInt(r.readLine());

        for (int i : num) {
            if (i > 0) {
                positiv++;
            } else if (i < 0) {
                negativ++;
            }
        }
        System.out.println("количество отрицательных чисел: " + negativ);
        System.out.println("количество положительных чисел: " + positiv);
    }
}
