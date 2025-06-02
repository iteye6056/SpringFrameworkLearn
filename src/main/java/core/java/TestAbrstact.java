package core.java;

public abstract class TestAbrstact {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    public void testAb(){
        System.out.println("this is from TestAbstract");
    }

    public abstract void testAb2();

    public TestAbrstact(String name){
        //name = "this is from TestAbstract";
        this.name = name;
        System.out.println("this is from TestAbstract");
    }
}
