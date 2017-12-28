package com.javarush.task.task04.task0404;

/* 
Реализовать метод addNewCat
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        /*
        Если переменная (свойство)  объявлена как "static",
        то обращаться к не нужно через имя класса (Cat).
        Если бы переменная была без "static", то обращаться к не нужно через "this".
        */
        Cat.catsCount ++;
    }

    public static void main(String[] args) {

    }
}
