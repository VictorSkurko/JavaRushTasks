package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        Map<String, Integer> map = new HashMap<>();
        map.put("Aaaa", 100);
        map.put("Bbbb", 1000);
        map.put("Abbb", 1000);
        map.put("Baaa", 1000);
        map.put("Caaa", 1000);
        map.put("Cbbb", 1000);
        map.put("Cccc", 100);
        map.put("Daaa", 1000);
        map.put("Dbbb", 1000);
        map.put("Dccc", 100);

        return (HashMap<String, Integer>) map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator <Map.Entry<String, Integer>> entries = map.entrySet().iterator();
        // Iterator - тип перменной типа <Map.Entry<String, String>>
        // создаем переменную типа Iterator и называем ее entries
        // присваиваем ей значение всех множеств пар из map ALL.K-V

        while (entries.hasNext()) // пока все множества пар не закончились
        {
            Map.Entry<String, Integer> entry = entries.next();
            // Map.Entry - тип переменной одного поля K-V
            // создаем переменную - entry
            // и присваиваем ей значение следующего next из всех множеств;

            if (entry.getValue() < 500) // если зп меньше 500 в значении getValue полученного одного поля
            {
                entries.remove(); // то берем все множество, и удаляем поле, на котором сейчас установлен итератор
            }
        }
    }
    public static void main(String[] args) {

    }
}