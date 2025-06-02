package org.example;

import core.java.Children;
import core.java.GrandParent;
import core.java.Parent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<Children> cld = new ArrayList<>();

        Children cc = new Children();
        cc.setAge(10);
        cld.add(cc);
        List<? extends Parent> prt = new ArrayList();

        prt = cld;
        for(Parent c:prt){
            System.out.println("Child age is "+c.getAge());
        }

        List<? super Parent> grad = new ArrayList<GrandParent>();
        List<GrandParent> gld = new ArrayList<>();
        GrandParent gp = new GrandParent();
        gp.setName("KKK");

        gld.add(gp);
        grad = gld;
        for(Object cd:grad){
            GrandParent test =  (GrandParent)cd;
            System.out.println("GrandParent name is "+ test.getName());
        }

        grad = new ArrayList<Parent>();
        Parent pp = new Parent();
        pp.setAge(30);
        grad.add(pp);
        for(Object cd:grad){
            Parent test =  (Parent)cd;
            System.out.println("Parent age is "+ test.getAge());
        }

        ApplicationContext appContext = new ClassPathXmlApplicationContext();



    }
}