package com.javarush.task.task03.task0304;

/* 
Задача на проценты

Реализуй метод addTenPercent, который увеличивает переданное целое число на 10%.
Исправь ошибку в заголовке метода.
Подсказка:
подумай, какие у этого метода входные и выходные данные.

Требования:
1. Тип возвращаемого значения у метода addTenPercent должен соответствовать заданию.
2. Метод addTenPercent должен увеличивать переданное число на 10% процентов.
3. Метод main должен вызывать метод addTenPercent.
4. Метод main должен выводить результаты вызова на экран.
5. Метод addTenPercent не должен ничего выводить на экран.
*/

public class Solution {
    public static double addTenPercent(int i) {
        return i*1.1;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
