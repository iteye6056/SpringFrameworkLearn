package org.example;

import core.java.MyAnnotation;
import core.java.Parent;

import java.lang.reflect.Method;

public class TestAnnotation {

    public static void main(String[] args) {
        //test();
        testExtension();
    }

    @MyAnnotation(defaultValue = "NewValue")
    @Deprecated
    public static void test(){
        try {
            Method method = TestAnnotation.class.getDeclaredMethod("test");
            MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.defaultValue());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
      }

      public static void testExtension(){
        Parent pp = new Parent();
        pp.test();
        pp.testParent();

    }
}


