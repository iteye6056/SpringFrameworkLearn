package core.java;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LamdaStreamTry {
    private static List<String> myList = new ArrayList<>();

    public static void main(String[] args) {
        //myList.forEach(s->add(s));
        myList.add("try1");
        myList.add("try2");
        myList.add("try345");

        myList.stream().filter(s->s.length()>4).map(String::toUpperCase).forEach(LamdaTry::output);

        List<String> newList = myList.stream().filter(s->s.length()<5).collect(Collectors.toList());

        newList.forEach(LamdaTry::output);

    }
    public static void add(String s){
        myList.add("STR"+s);
    }

    public static void output(String s){
        System.out.println(s);
    }
}
