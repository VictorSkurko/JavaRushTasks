package com.javarush.task.task04.task0406;

/* 
Реализовать метод setName

Генеральный консул планеты Руфус Андрю-Ша застрял на межгалактической железной дороге
по причине некорректной работы программы учёта пассажиров дипломатического корпуса Федерации.
В этой программе сломался метод фиксации имен.
Давайте исправим ситуацию: напишем для железнодорожников необходимый им метод setName.
*/

public class Cat {
    private String fullName;

    public void setName(String firstName, String lastName) {
        String fullName = firstName + " " + lastName;
        //напишите тут ваш код
        //Здесь обращаемся к переменной класса private String fullName
        //через this потому, что она не статичная (не static)
        this.fullName = fullName;

    }

    public static void main(String[] args) {

    }
}
