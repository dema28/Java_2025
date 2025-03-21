package Lessons_16;

import java.util.ArrayList;
import java.util.List;

public class Main {

//    public static void main(String[] args) {
//
//        List<String> strings = new ArrayList<>();
//        System.out.println(strings);
//        strings.add("one");
//        System.out.println(strings);
//        strings.add("two");
//        strings.add("three");
//        System.out.println(strings);
//        strings.remove(0);
//        System.out.println(strings);
//        strings.remove( "two");
//
//        for (int i = 0; i < strings.size(); i++) {
//            String s = strings.get(i);
//            System.out.println(s);
//        }
//
//        List<Integer> ints = new ArrayList<>();
//        ints.add(1);
//        int elem = ints.get(0);
//        System.out.println(elem);
//
//    }
    public static void main(String[] args){
        System.out.println(filterbyPrefix("a", List.of("a")));
    }



    public static List<String> filterbyPrefix(String prefix, List<String> strings) {
        List<String> filteredStrings = new ArrayList<>();
        for (String s : strings) {
            if (s.startsWith(prefix)) {
                filteredStrings.add(s);
            }
        }
        return filteredStrings;



    }

}
