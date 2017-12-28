package com.javarush.task.task03.task0309;

/* 
Сумма 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int i = 1, k = 1;
        while (i <= 10) {
            System.out.println(k);
            k = k + (i + 1);
            i++;
        }

    }
}
