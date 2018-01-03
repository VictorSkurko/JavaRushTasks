package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    //напишите тут ваш код
    private int left;
    private int top;
    private int width;
    private int height;

    public Rectangle(int left, int top, int wigth, int height)
    {
        this.left = left;
        this.top = top;
        this.width = wigth;
        this.height = height;
    }
    public Rectangle(int left, int top)
    {
        this.left = left;
        this.top = top;
        this.height = 0;
        this.width = 0;
    }
    public Rectangle(int width)
    {
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle rectangle)
    {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.height = rectangle.height;
        this.width = rectangle.width;
    }


    public static void main(String[] args) {
    }
}
