package Novicov.Lessons09;

public class Main1 {
    public static void main(String[] args) {
        Grade five = new Grade(5);
        System.out.println(five.getNumGrade());

        Grade anotherFive = new Grade(5);
        System.out.println(five.equals(anotherFive));

        Grade a = new Grade('A');
        System.out.println(five.equals(a));
    }

}
