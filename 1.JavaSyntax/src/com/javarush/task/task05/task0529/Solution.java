package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int summ = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (; true; ) {
            String s = r.readLine();
            if (s.equals("сумма")) {
                break;
            }
            int i = Integer.parseInt(s);
            summ +=i;
        }
        System.out.println(summ);
    }
}
