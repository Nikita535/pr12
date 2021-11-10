package ru.mirea.lab2;

public class Person {
    private String name, surname, patronymic;


    public Person(String name, String surname, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }
    public String getFio(){
        StringBuilder sb = new StringBuilder(surname);
        if( !name.equals(""))
            sb.append(" ").append(name);
        if(!patronymic.equals(""))
            sb.append(" ").append(patronymic);
        return sb.toString();
    }


}
