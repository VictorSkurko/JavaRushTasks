package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        String snum = r.readLine();

        int inum = Integer.parseInt(snum);
        int lnum = snum.length();
        String l = null, n;

        if (inum >= 1 && inum <= 999) {

        switch (lnum) {
            case 1:
                l = "однозначное";
                break;
            case 2:
                l = "двузначное";
                break;
            case 3:
                l = "трехзначное";
                break;
        }

        if (inum % 2 == 0) {
            n = "четное";
        } else {
            n = "нечетное";
        }
        System.out.println(n +" " + l + " число");
        }
    }
}