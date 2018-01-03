package com.javarush.task.task05.task0525;

/* 
И целой утки мало
И целой утки мало
По аналогии с классом Duck (утка) создай классы Cat (кошка) и Dog (собака).
Подумай, что должен возвращать метод toString в классах Cat и Dog?
В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
Требования:
1. Создай класс Cat(кошка).
2. Создай класс Dog(собака).
3. У класса Cat должен быть верно реализован метод toString.
4. У класса Dog должен быть верно реализован метод toString.
5. В методе main создай два объекта типа Cat.
6. В методе main создай два объекта типа Dog.
7. Выведи все созданные объекты на экран.
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        //напишите тут ваш код
        Dog  dog01 = new Dog();
        Dog  dog02 = new Dog();
        System.out.println(dog01);
        System.out.println(dog02);

        Cat cat01 = new Cat();
        Cat cat02 = new Cat();
        System.out.println(cat01);
        System.out.println(cat02);


    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    //напишите тут ваш код
    public static class Dog {
        public String toString() {
            return "Dog";
        }
    }

    public static class Cat {
        public String toString() {
            return "Cat";
        }
    }
}
