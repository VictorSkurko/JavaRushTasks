package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings= new ArrayList<>();;

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
//        ArrayList<String> strings = new ArrayList<>();
        int max = 0;

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String s = r.readLine();
            strings.add(s);
        }

        for (int i = 0; i < 5; i++) {
        if (strings.get(i).length() > max) {
            max = strings.get(i).length();
//                System.out.println(list.get(i));
            }
        }

        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == max) {
                System.out.println(strings.get(i));
            }
        }
    }
}