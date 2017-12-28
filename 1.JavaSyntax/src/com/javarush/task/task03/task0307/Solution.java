package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
Создать 10 зергов, 5 протоссов и 12 терран.
Дать им всем уникальные имена.
Требования:
1. Нужно создать 10 объектов типа Zerg и каждому из них дать свое имя.
2. Нужно создать 5 объектов типа Protoss и каждому из них дать свое имя.
3. Нужно создать 12 объектов типа Terran и каждому из них дать свое имя.
4. Нельзя изменять классы Zerg, Protoss и Terran.
*/

public class Solution {
    public static void main(String[] args) {

        Zerg[] zerg = new Zerg[10];
        Protoss[] protoss = new Protoss[5];
        Terran[] terran = new Terran[12];

        int i = 0;
        while (i < zerg.length) {
            zerg[i] = new Zerg();
            zerg[i].name = "Zerg #"+i;
            System.out.println("Create new " + zerg[i].name);
            i++;
        }

        i = 0;
        while (i < protoss.length) {
            protoss[i] = new Protoss();
            protoss[i].name = "Protoss #"+i;
            System.out.println("Create new " + protoss[i].name);
            i++;
        }

        i = 0;
        while (i < terran.length) {
            terran[i] = new Terran();
            terran[i].name = "Terran #"+i;
            System.out.println("Create new " + terran[i].name);
            i++;
        }



    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
