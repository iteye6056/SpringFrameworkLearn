package core.java;

public class AnotherGenericClass <String,Object>{

    private String name;
    private Object obj;
    public AnotherGenericClass(String name, Object obj) {
        this.name = name;
        this.obj = obj;
    }
    public String getName() {
        return name;
    }
    public Object getObj(){
        return obj;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setObj(Object obj){
        this.obj = obj;
    }
}
