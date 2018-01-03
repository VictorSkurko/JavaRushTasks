package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес (чужой домашний кот)

Задача инициализатора - сделать объект валидным.
Например, если вес неизвестен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста.
А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat {

    String name = null;
    int weight = 3;
    int age = 4;
    String color = "grey";
    String address = null;

//7. У класса должен быть метод initialize, принимающий в качестве параметра
// имя, но инициализирующий все переменные класса, кроме адреса.

    public void initialize(String name) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
//У класса должен быть метод initialize, принимающий в качестве параметров
// имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
    public void initialize(String name, int weight, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
//9. У класса должен быть метод initialize, принимающий в качестве параметров
// имя, возраст и инициализирующий все переменные класса, кроме адреса.

    public void initialize(String name, int age) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
//У класса должен быть метод initialize, принимающий в качестве параметров
// вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.

    public void initialize(int weight, String color) {
        this.weight = weight;
        this.age = age;
        this.color = color;
    }
    //У класса должен быть метод initialize, принимающий в качестве параметров
    // вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.

    public void initialize(int weight, String color, String address) {
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {
    }
}
