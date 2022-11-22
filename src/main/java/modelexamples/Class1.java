package modelexamples;

public class Class1 {
    private String firstParameter;
    private String secondParameter;
    private String thirdParameter;

    public Class1(String firstParameter, String secondParameter, String thirdParameter) {
        this.firstParameter = firstParameter;
        this.secondParameter = secondParameter;
        this.thirdParameter = thirdParameter;
    }

    public String getFirstParameter() {
        return firstParameter;
    }

    public void setFirstParameter(String firstParameter) {
        this.firstParameter = firstParameter;
    }

    public String getSecondParameter() {
        return secondParameter;
    }

    public void setSecondParameter(String secondParameter) {
        this.secondParameter = secondParameter;
    }

    public String getThirdParameter() {
        return thirdParameter;
    }

    public void setThirdParameter(String thirdParameter) {
        this.thirdParameter = thirdParameter;
    }
}
