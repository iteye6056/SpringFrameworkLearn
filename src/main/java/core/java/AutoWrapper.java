package core.java;

import java.util.HashMap;
import java.util.Map;

public class AutoWrapper {

    public static void main(String[] args) {
        int a = 8;
        Integer b = 9;
        System.out.println(Integer.valueOf(a));
        System.out.println("test int and integer --- " + (a == b));
        Map<Integer, String> myMap = new HashMap<>();
        myMap.put(a, "基本类型");
        myMap.put(b, "包装类型");

        for (int key : myMap.keySet()) {
            System.out.println("key:" + key + " value: " + myMap.get(key));

        }

        if (myMap.containsKey(a)) {
            System.out.println("key " + a + " exist");
        }

        myMap.forEach((k, v) -> System.out.println("key:" + k + ", value: " + v));

        Character c = new Character('a');
        char d = 'a';
        System.out.println("Character cover to char value -- " + c.charValue());

        System.out.println(c.equals(d));
        System.out.println(Character.valueOf(d).equals(c));

        System.out.println(Character.isDigit(c));
        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit(8));

        Boolean e = true;
        boolean f = true;
        System.out.println(e == f);
        System.out.println(Boolean.valueOf(f) == e);

    }
}
