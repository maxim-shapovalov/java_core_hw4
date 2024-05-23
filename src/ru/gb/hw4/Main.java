package ru.gb.hw4;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(42, "Сергей", Gender.Male);
        Person person2 = new Person(35, "Валентина", Gender.Female);
        Person person3 = new Person(29, "Инокентий", Gender.Male);
        Person[] people = {person1, person2, person3};


        for (Person person : people) {
            System.out.println(person.toString());
        }

        Congratulation.congratulation(people, Holiday.March_8);
        Congratulation.congratulation(people, Holiday.February_23);
    }
}
