package Lessons06;

public class Main {
    public static void main(String[] args) {
        String str = "Hello, world!";
        System.out.println(str.substring(7));
        System.out.println(str.substring(0, 4));
        System.out.println(str.substring(str.length() - 3));
        System.out.println(str.charAt(5));

        System.out.println(str.equals("Hello, world!"));
        System.out.println(str.equalsIgnoreCase("Hello, WorLd!"));

        System.out.println(str.toString());


        System.out.println(str.compareTo("AAA"));



        System.out.println(str);

    }
}
