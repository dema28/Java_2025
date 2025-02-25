package Novicov.Review4;

public class Person {

    public static int adultAge = 18;



    public static String name;
    public static int age;
    public void prinMe (){
        System.out.println(getInfo());
    }

//    public String getInfo() {
//        return "Name: " + name + ", Age: " + age;
//    }

    public static String getInfo() {
        if (age >= adultAge) {
            return "Name: " + name + ", is an : " + age + ", Status: Adult";
        } else {
            return "Name: " + name + ", Age: " + age + ", Status: Child";
        }
    }

}
