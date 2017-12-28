package com.javarush.task.task01.task0131;

/* 
Полнометражная картина
*/

import static java.lang.Math.floor;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getMetreFromCentimetre(243));
    }

    public static int getMetreFromCentimetre(int centimetre) {
//        int metre = (int) floor(centimetre/100);
        return (int) floor(centimetre/100);
    }
}