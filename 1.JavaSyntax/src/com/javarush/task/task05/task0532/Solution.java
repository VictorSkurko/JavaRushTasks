package com.javarush.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(r.readLine());
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            list[i] = Integer.parseInt(r.readLine());
        }

        int maximum = list[0];

        for (int i = 0; i < list.length; i++) {
            if (list[i] > maximum) {
                maximum = list[i];
            }
        }
        System.out.println(maximum);
    }
}
