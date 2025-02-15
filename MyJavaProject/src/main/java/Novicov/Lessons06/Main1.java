package Novicov.Lessons06;

public class Main1 {
    public static void main(String[] args) {
        String[] months = {"январь", "февраль", "март", "апрель",
                "май", "июнь", "июль", "август", "сентябрь",
                "октябрь", "ноябрь", "декабрь"
        };

        for (int i = 0; i < months.length; i++) {
            String m = months[i];
            if(m.length() < 4)
                System.out.println(m);
        }
    }
}
