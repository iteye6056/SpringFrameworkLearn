package core.java;

public class ThirdGenericClass <MyType extends AnotherGenericClass>{

    private MyType obj;

    public void checkGenericObj(MyType obj){
        this.obj = obj;
        obj.setName("Third Generic Name is here");
        System.out.println("This is third generic method name"+obj.getName());

    }
}
