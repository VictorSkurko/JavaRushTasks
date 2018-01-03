package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код
        BufferedReader rs = new BufferedReader(new InputStreamReader(System.in));
        String s = rs.readLine();
        return s;
    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader ri = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(ri.readLine());
        return i;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(rd.readLine());
        return d;
    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        boolean b = Boolean.parseBoolean(rb.readLine());
        return b;
    }

    public static void main(String[] args) {

    }
}
