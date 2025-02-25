package Novicov.Review4;

public class Main {
    public static void main(String[] args) {
        String  s = "Посмотрите как Рите нравится ритм";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            int index = s.indexOf("рит", i);
            if (index > -1) {
                i = index;
                System.out.println(index);
            } else {
                break;
            }
        }

    }
}
