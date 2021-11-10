package ru.mirea.lab2;

public class Phone {
    private String code,city,three,four;

    public Phone(String phone){
        //если начинается с 8 заменяем на +7
        if (phone.charAt(0)=='8'){
            code="+7";
        }else{
            //первые два символа, то есть +7
            code = phone.substring(0,phone.length()-10);
        }
        //выбираем символы от 2 и до 5 (495)
        city = phone.substring(phone.length()-10, phone.length()-7);
        //выбираем символы от 5 и до 8
        three = phone.substring(phone.length()-7, phone.length()-4);
        //с 8 и до конца
        four = phone.substring(phone.length()-4);
    }

    @Override
    public String toString() {
        return code+"-" + city + "-" + three + "-" + four;
    }



}
