package ru.gb.hw4;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person(42, "Sergey", Gender.Male);
        Person person2 = new Person(35, "Valentina", Gender.Female);
        Person person3 = new Person(29, "Inokenty", Gender.Male);
        Person person4 = new Person(34, "Ashot", Gender.Male);
        Person person5 = new Person(29, "Goar", Gender.Female);
        Person[] people = {person1, person2, person3, person4, person5};


        for (Person person : people) {
            System.out.println(person.toString());
        }

        Congratulation.congratulation(people, Holiday.March_8);
        Congratulation.congratulation(people, Holiday.February_23);
    }
}
