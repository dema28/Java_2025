package Lessons04;

public class Main6 {
    public static void main(String[] args) {
        int age = 68;
        /*
        0 - 2 baby
        2 - 12 child
        12 - 19 teenager
        19 - 65 adult
         */
        if (age < 0){
            System.out.println("Error: Age can't be negative");
            return;
        }
        if (age <= 2){
            System.out.println("Baby");
        } else if (age < 12){
            System.out.println("Child");
        } else if (age < 19) {
            System.out.println("Teenager");
        } else {
            System.out.println("Adult");
        }
        System.out.println("Your age is " + age + ", you are a " + (age <= 65? "adult" : "senior"));
    }
}
