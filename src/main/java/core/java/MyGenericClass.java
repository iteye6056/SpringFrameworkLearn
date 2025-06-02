package core.java;

import sun.lwawt.macosx.CSystemTray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MyGenericClass {

    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        HashSet setStr = new HashSet();

        for(int i=0;i<10;i++){
            str.add("str"+i%10);
            setStr.add("str"+i%10);
        }


        for(String s:str){
            System.out.println(s);
        }
        System.out.println("*****************");
        for(Object s:setStr){
            System.out.println(s.toString());
        }
        System.out.println("---------------");

        AnotherGenericClass<String,Object> testGeneric = new AnotherGenericClass<>("FirstString",new Object());
        System.out.println(testGeneric.getName());
        System.out.println(testGeneric.getObj());

        ThirdGenericClass testGeneric3 = new ThirdGenericClass();
        testGeneric3.checkGenericObj(testGeneric);


    }
}
