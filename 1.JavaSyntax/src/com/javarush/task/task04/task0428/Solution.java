package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        Integer[] num = new Integer[3];
        int positiv = 0;

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        num[0] = Integer.parseInt(r.readLine());
        num[1] = Integer.parseInt(r.readLine());
        num[2] = Integer.parseInt(r.readLine());

        for (int i : num) {
            if (i > 0) {
                positiv++;
            }
        }
        System.out.println(positiv);
    }
}
