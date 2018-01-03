package com.javarush.task.task08.task0802;

/* 
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        HashMap<String, String> maplist = new HashMap<>();
        maplist.put("арбуз", "ягода");
        maplist.put("банан", "трава");
        maplist.put("вишня", "ягода");
        maplist.put("груша", "фрукт");
        maplist.put("дыня", "овощ");
        maplist.put("ежевика", "куст");
        maplist.put("жень-шень", "корень");
        maplist.put("земляника", "ягода");
        maplist.put("ирис", "цветок");
        maplist.put("картофель", "клубень");

        for (HashMap.Entry<String, String> pair : maplist.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key +" - "+ value);
        }
    }
}