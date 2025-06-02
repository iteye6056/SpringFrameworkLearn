package core.java;

public class Parent extends GrandParent {

    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void testParent(){
        System.out.println("Parent");
    }
}
