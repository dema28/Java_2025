package Novicov.Review4;

public class Person {

    public static int adultAge = 18;

    public static String name;

    public static int age;

    public void prinMe (){
        System.out.println(getInfo());
    }

    public void setAge(int myAge) {
        age = myAge;
    }

    public static String getInfo() {
        if (age >= adultAge) {
            return "{Name: " + name + ", is an adult " + age + "years old}";
        } else {
            return "{Name: " + name + ", is a child" + age + ", years of age}";
        }
    }

    public static void printPeopleAges(Person[] people) {
        for (Person person: people) {
            System.out.println(person.age + ", ");

        }
        System.out.println();
    }

}
