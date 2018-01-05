package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }
        ArrayList<String> listMultiple = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                listMultiple.add(list.get(i));
                listMultiple.add(list.get(i));
            } else if (list.get(i).length() % 2 != 0) {
                listMultiple.add(list.get(i));
                listMultiple.add(list.get(i));
                listMultiple.add(list.get(i));
            }
        }
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            while (list.get(i).equals(listMultiple.get(j))) {
                System.out.print(listMultiple.get(j) + " ");
                j++;
                if (j >= listMultiple.size()) break;
            }
            System.out.println();
        }
    }
}