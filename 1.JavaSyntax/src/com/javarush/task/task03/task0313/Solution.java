package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».

Количество перестановок n! Т.е. в нашем случае 3! = 6


Подсказка: их 6 штук.
Каждую комбинацию вывести с новой строки. Слова не разделять.

Пример:
МылаРамуМама
РамуМамаМыла
...

Требования:
1. Программа должна выводить текст.
2. Выведенный текст должен содержать 6 строк.
3. Текст в каждой строке должен быть уникален.
4. Должны быть выведены все возможные комбинации.
*/

public class Solution {
    public static void main(String[] args) {
        String[] s = new String[3];
        s[0] = "Мама";
        s[1] = "Мыла";
        s[2] = "Раму";
        for (int i = 0; i < s.length; i++) {
            String s2 = "";
            for (int j = 0; j < s.length; j++) {
                if (j != i) s2 = s2 + s[j];
            }
            System.out.println(s[i] + s2);
            s2 = "";
            for (int j = s.length - 1; j >= 0; j--)
                if (j != i) s2 = s2 + s[j];
            System.out.println(s[i] + s2);
        }
    }
}