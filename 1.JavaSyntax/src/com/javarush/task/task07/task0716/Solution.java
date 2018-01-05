package com.javarush.task.task07.task0716;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("роза"); //0
        list.add("мера"); //1
        list.add("лоза"); //1
        list.add("лира"); //2
        list.add("вода"); //4

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //напишите тут ваш код
        String r = "р";
        String l = "л";

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            boolean isContainR = list.get(i).contains(r);
            boolean isContainL = list.get(i).contains(l);

            if (!isContainL && isContainR) {
                list.remove(i);
                i--;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            list.get(i);
            boolean isContainR = list.get(i).contains(r);
            boolean isContainL = list.get(i).contains(l);

            if (isContainL && !isContainR) {
                list.add(i, list.get(i++));
            }
        }
        return list;
    }
}