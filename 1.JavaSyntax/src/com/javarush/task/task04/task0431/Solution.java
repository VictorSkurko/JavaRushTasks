package com.javarush.task.task04.task0431;

/* 
От 10 до 1

Вывести на экран числа от 10 до 1 используя цикл while. Каждое значение с новой строки.

Требования:
1. Программа не должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Каждое значение должно быть выведено с новой строки.
4. Программа должна выводить числа от 10 до 1.
5. В программе должен использоваться цикл while.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int num = 10;
        while (num > 0) {
            System.out.println(num);
            num--;
        }
    }
}
