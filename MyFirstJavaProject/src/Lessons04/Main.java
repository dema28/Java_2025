package Lessons04;

public class Main {
    public static void main(String[] args) {
        boolean itMoves = true;
        boolean itShouldMove = true;

        if (itMoves && itShouldMove || !itMoves && itShouldMove){
            System.out.println("no problem");
        } else if (itShouldMove){
            System.out.println("Wd - 40");
        } else {
            System.out.println("Use duct tape");
        }
    }
}
