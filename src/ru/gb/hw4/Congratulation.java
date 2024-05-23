package ru.gb.hw4;

public class Congratulation {
    static void congratulation(Person[] people,Holiday holiday){
        for(Person person:people){
            if(holiday == Holiday.February_23 && person.getGender() == Gender.Male){
                System.out.println(Holiday.February_23.getTitle() + person.getName() + "!");
            } else if (holiday == Holiday.March_8 && person.getGender() == Gender.Female) {
                System.out.println(Holiday.March_8.getTitle() + person.getName() + "!");
            } else if(holiday == Holiday.New_Year){
                System.out.println(Holiday.New_Year.getTitle());
            }
        }
    }
}
