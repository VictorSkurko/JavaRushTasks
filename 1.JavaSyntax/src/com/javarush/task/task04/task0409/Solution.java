package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10

Десятка чрезвычайно популярна и привлекательна.
Все хотят быть как десятка. Или хотя бы как можно ближе к ней.
Вот стоят два числа, и думают: а которое из них круче?
Ответ: то, что находится ближе к десятке.
Давайте напишем для этих чисел метод closeToTen,
в котором будем анализировать, какое из двух чисел круче.

Реализовать метод closeToTen. Метод должен выводить на экран ближайшее к 10 из двух чисел,
записанных в аргументах метода.
Например, среди чисел 8 и 11 ближайшее к десяти 11.
Если оба числа на равной длине к 10, то вывести на экран любое из них.

Подсказка:
используйте метод public static int abs(int a), который возвращает абсолютную величину числа.


Требования:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать System.out.println() или System.out.print().
3. Метод main должен вызывать метод closeToTen только два раза.
4. Метод closeToTen должен вызывать метод abs.
5. Метод closeToTen должен выводить число на экран согласно заданию.
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        //напишите тут ваш код

        int ak = abs(10-a);
        int bk = abs(10-b);

        if (ak < bk) {
            System.out.println(a);
        } else if (ak > bk) {
            System.out.println(b);
        } else {
            System.out.println(a);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}