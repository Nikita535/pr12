package ru.mirea.lab2;
import java.util.StringTokenizer;

public class Address {

    private String country , region , city , street , house , corps , flat;

    public Address(String stringToParse,boolean MultiSeparator){
        if(stringToParse==null) throw new NullPointerException();
        String[] s;
        //MultiSeparator - если в строке содержатся разные знаки препинания (false/true)
        if (MultiSeparator) {
            //объект класса StringTokenizer (строка, разделители)
            StringTokenizer st = new StringTokenizer(stringToParse, ",.;");
            //динамическое создание массива по количеству элементов
            s = new String [st.countTokens()];
            int i = 0;
            //заполнение массива
            while(st.hasMoreTokens()) s[i++] = st.nextToken();
        }else{//если разделитель в строке только запятая
            s = stringToParse.split(",");
        }
        //
        if(s.length < 7) throw new IllegalArgumentException("Строка неполная");
        //trim удаляет пробелы в начале и в конце
        country = s[0].trim();
        region = s[1].trim();
        city = s[2].trim();
        street = s[3].trim();
        house = s[4].trim();
        corps = s[5].trim();
        flat = s[6].trim();
    }
    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", housing='" + corps + '\'' +
                ", flat='" + flat + '\'' +
                '}';
    }

}
