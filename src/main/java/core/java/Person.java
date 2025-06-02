package core.java;


import java.beans.BeanInfo;

@Super
public class Person extends TestAbrstact implements TestInterface{

   // String name;

    Integer age;

    public Person(String name) {
        super(name);
        System.out.println("this is from Person - "+name);
    }

    public static void main(String[] args) {
        Person person = new Person("testing");
        System.out.println("Test Abstract "+person.getName());
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //Implement the TestInterface interface
    @Override
    public void test() {
        System.out.println(" person class implements TestInferace");
    }

    @Override
    public void test2() {

    }

    @Override
    public void testAb2() {
        System.out.println(" person class implements testAb2 method in TestAbstract class");
    }


    //Implement the TestAbstract class
//    @Override
//    public void testAb() {
//        System.out.println(" person class implements TestAbstract");
//    }
}
