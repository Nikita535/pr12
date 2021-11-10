package ru.mirea.lab2;

public class Shirt {
    private String num,name,color,size;

    public Shirt(String stringToParse){
        String[] s=stringToParse.split(",");
        num=s[0];
        name=s[1];
        color=s[2];
        size=s[3];
    }

    @Override
    public String toString() {
        return "Shirt:\n" +
                "\tnum='" + num+ '\'' +
                "\n\tname='" + name + '\'' +
                "\n\tcolor='" + color + '\'' +
                "\n\tsize='" + size + '\'';
    }
}
