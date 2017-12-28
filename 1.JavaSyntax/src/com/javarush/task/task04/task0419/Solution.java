package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел

Максимумом называется n-арная операция (операция над n числами),
возвращающая наибольшее из чисел.
Нет, нам в секретном центре JavaRush совсем не обязательно знать такие определения.
Мы тут для того, чтобы учиться писать код.
В этой задаче нужно ввести с клавиатуры четыре числа,
затем — вычислить наибольшее из них и вывести его на экран.

Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить число на экран.
3. Программа должна выводить на экран максимальное из четырёх чисел.
4. Если числа равны между собой, необходимо вывести любое.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int d = Integer.parseInt(reader.readLine());

        max4(a, b, c, d);
    }

    private static void max4(int a, int b, int c, int d) {
        if (a == max3(a, b, c) && a >= d)
            System.out.println(a);
        else {
            if (b == max3(a, b, c) && b >= d)
                System.out.println(b);
            else {
                if (c == max3(a, b, c) && c >= d)
                    System.out.println(c);
                else
                    System.out.println(d);
            }
        }
    }

    private static int max3(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else {
            if (b >= a && b >= c) return b;
            else return c;
        }
    }
}
