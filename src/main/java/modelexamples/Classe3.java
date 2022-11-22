package modelexamples;

public class Classe3 {
    private String param;

    private Class2 class2;

    public Classe3(String param) {
        this.param = param;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public Class2 getClass2() {
        return class2;
    }

    public void setClass2(Class2 class2) {
        this.class2 = class2;
    }

    public String method1(Class1 class1){
        return (param + class1.getFirstParameter());
    }

    public String method2(Class2 class2){
        this.class2 = class2;
        return (param + class2.getParameter1());
    }
}
