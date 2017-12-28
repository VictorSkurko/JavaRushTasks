package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1, k = 1;
        while (i < 10) {
            k = k * (i + 1);
            i++;
        }
        System.out.println(k);
    }
}
