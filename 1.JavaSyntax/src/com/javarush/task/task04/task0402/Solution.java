package com.javarush.task.task04.task0402;

/* 
Цена яблока

Для изменения статической переменной класса используется конструкция вида: ClassName.variableName.
Соответственно, вместо this.applesPrice нужно использовать Apple.applesPrice
*/
public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        //Здесь увеличиваем статическую переменную класса Apple на 50
        apple.addPrice(50);

        Apple apple2 = new Apple();
        //И теперь еще увеличиваем на 100
        apple2.addPrice(100);

        //В итоге статическая переменная класса Apple (static int applesPrice)
        //теперь равна 150
        System.out.println("Apples price is " + Apple.applesPrice);
    }

    public static class Apple {
        public static int applesPrice = 0;

        public static void addPrice(int applesPrice) {
            //напишите тут ваш код
            Apple.applesPrice +=applesPrice;
        }
    }
}
