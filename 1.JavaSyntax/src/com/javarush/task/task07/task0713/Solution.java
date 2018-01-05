package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {


    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(i, Integer.parseInt(r.readLine()));
        }

        ArrayList<Integer> listThree = new ArrayList<>();
        ArrayList<Integer> listTwo = new ArrayList<>();
        ArrayList<Integer> listOther = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i)% 2 == 0 &&  list.get(i)% 3 == 0) {
                listThree.add(list.get(i));
                listTwo.add(list.get(i));

            } else if (list.get(i) % 2 != 0 && list.get(i) % 3 == 0) {
                listThree.add(list.get(i));

            } else if (list.get(i) % 2 == 0 && list.get(i) % 3 != 0) {
                listTwo.add(list.get(i));

            } else if (list.get(i) % 2 != 0 && list.get(i) % 3 != 0){
                listOther.add(list.get(i));
            }
        }
        printList(listThree);
        printList(listTwo);
        printList(listOther);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
