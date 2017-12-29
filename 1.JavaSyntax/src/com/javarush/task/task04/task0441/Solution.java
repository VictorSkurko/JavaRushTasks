package com.javarush.task.task04.task0441;


/* 
Как-то средненько
Ввести с клавиатуры три числа, вывести на экран среднее из них.
Т.е. не самое большое и не самое маленькое.
Если все числа равны, вивести любое из них.
Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить среднее из трех чисел.
4. Если все числа равны, вывести любое из них.
5. Если два числа из трех равны, вывести любое из двух.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(r.readLine());
        int n2 = Integer.parseInt(r.readLine());
        int n3 = Integer.parseInt(r.readLine());

        int temp;

        if (n1 > n2) {
            temp = n1;
            n1 = n2;
            n2 = temp;
        }

        if (n2 > n3) n2 = n3;

        if (n1 > n2) n2 = n1;

        System.out.println(n2);
    }
}