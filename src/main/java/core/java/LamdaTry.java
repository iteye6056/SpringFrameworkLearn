package core.java;

import java.util.ArrayList;
import java.util.List;

public class LamdaTry {

    private static List<String> myList = new ArrayList<>();

    public static void main(String[] args) {
        //myList.forEach(s->add(s));
        myList.add("try1");
        myList.add("try2");
        myList.add("try3");
//        myList.forEach((s)-> {System.out.println(s+"test");});
        myList.forEach(s->add(s)); //常见的Lamda表达式
//        myList.forEach(String::toUpperCase);
        myList.forEach(LamdaTry::output); //终极简化版Lamda 表达式

    }
    public static void add(String s){
        myList.add("STR"+s);
    }

    public static void output(String s){
        System.out.println(s);
    }
}
