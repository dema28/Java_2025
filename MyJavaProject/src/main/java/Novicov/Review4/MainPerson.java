package Novicov.Review4;

public class MainPerson {
    public static void main(String[] args) {

        System.out.println(Person.adultAge);

        Person jane = null;
        jane = new Person();

        jane.name = "Jane";
        jane.age = 10;
        jane.prinMe();
        System.out.println(Person.getInfo());
        System.out.println(Person.adultAge);

        Person john = new Person();
        john.name = "John";
        john.age = 25;
        System.out.println(Person.getInfo());
        System.out.println(Person.adultAge);


    }
}
