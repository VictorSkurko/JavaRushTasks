package com.javarush.task.task04.task0436;


/* 
Рисуем прямоугольник

Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.

Пример: m=2, n=4
8888
8888


Требования:
1. Программа должна считывать два числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить прямоугольник размером m на n из восьмёрок.
4. В программе должен использоваться цикл for.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int i, j;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int m = Integer.parseInt(r.readLine());
        int n = Integer.parseInt(r.readLine());

        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
            j = 0;
        }
    }
}