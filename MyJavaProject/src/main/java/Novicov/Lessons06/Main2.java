package Novicov.Lessons06;

public class Main2 {
    public static void main(String[] args) {
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int min = Integer.MIN_VALUE;
//        int max = Integer.MAX_VALUE;
        for (int i = 1; i < daysInMonth.length; i++) {
            int days = daysInMonth[i];
            if (days < min) {
                min = days;
            }

            System.out.println(days);

        }





//        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
//        int sum = 0;
//        for (int i = 0; i < daysInMonth.length; i++) {
//            sum += daysInMonth[i];
//            System.out.println(sum);
//        }
//        System.out.println("----------------------------------------------------------------");
//        System.out.println(sum);
    }
}
