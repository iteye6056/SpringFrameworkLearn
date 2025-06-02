package core.java;

public interface TestInterface {

    String name = "this is name of testInterface";
    public void test();

    public void test2();

    default void test3() {
        System.out.println("test3");
    }

    static void test4() {
        System.out.println("test4");
    }
}
