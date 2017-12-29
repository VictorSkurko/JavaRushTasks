package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Выведенные числа должны быть разделены пробелом.
4. Программа должна выводить числа в порядке убывания.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Integer [] arr = new Integer[3];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        arr[0] = Integer.parseInt(reader.readLine());
        arr[1] = Integer.parseInt(reader.readLine());
        arr[2] = Integer.parseInt(reader.readLine());

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
    }
}
