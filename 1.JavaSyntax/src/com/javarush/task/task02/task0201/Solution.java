package com.javarush.task.task02.task0201;

/* 
Реализуем метод print
*/
public class Solution {
    public static void main(String[] args) {
        print("Java easy to learn!");
    }

    public static void print(String s) {
        int i = 0;
        while(i<4){
            System.out.println(s);
            i++;
        }
    }
}
