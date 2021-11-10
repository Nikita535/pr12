package ru.mirea.lab2;

public class Main {

    public static void main(String[] args) {

        //Task1

        Person p1 = new Person("","Ракова","");
        Person p2 = new Person("", "Петров", "");
        Person p3 = new Person("Романов","Александр" , "Артёмович");

        System.out.println(p1.getFio());
        System.out.println(p2.getFio());
        System.out.println(p3.getFio());

        System.out.println();

        //Task2
        Address a1 = new Address("Россия, МО   ,    Москва, проспект Вернадского, 78, 7, Г-226-1", false);
        Address a2 = new Address("USSR,      Leningradskaya oblast', Leningrad.    Nevskiy prospect; 234;1;23", true);
        Address a3 = new Address("UK, London, London, Trafalgar square, 2, 3, 4, other string,,,", false);
        Address a4 = new Address("Страна; регион;     город    . Улица, дом, корпус. Квартира", true);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        System.out.println();
        //Task 3
        String[] str = new String[]{
                "S001,Black Polo Shirt,Black,XL",
                "S002,Black Polo Shirt,Black,L",
                "S003,Blue Polo Shirt,Blue,XL",
                "S004,Blue Polo Shirt,Blue,M",
                "S005,Tan Polo Shirt,Tan,XL",
                "S006,Black T-Shirt,Black,XL",
                "S007,White T-Shirt,White,XL",
                "S008,White T-Shirt,White,L",
                "S009,Green T-Shirt,Green,S",
                "S010,Orange T-Shirt,Orange,S",
                "S011,Maroon Polo Shirt,Maroon,S"
        };
        Shirt[] shirts = new Shirt[str.length];
        for (int i = 0; i < str.length; i++) {
            shirts[i] = new Shirt(str[i]);
            System.out.println(shirts[i]);
        }

        System.out.println();
        //Task 4
        System.out.println(new Phone("88005553535"));
        System.out.println(new Phone("+78005553535"));
        System.out.println(new Phone("+1238005553535"));
        System.out.println(new Phone("+118005553535"));
    }
}
