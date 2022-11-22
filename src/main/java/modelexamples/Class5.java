package modelexamples;

public class Class5 implements Classe4Interface{
    private String class5Parameter;
    @Override
    public boolean authentication(String username, String password) {
        if(username == "Username" && password == "password"){
            return true;
        }else
            return false;
    }
}
