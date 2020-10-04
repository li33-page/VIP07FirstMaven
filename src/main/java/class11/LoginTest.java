package class11;

public class LoginTest {
    public static void main(String[] args) {
        LoginSample ls=new LoginSample();
        ls.login("Roy","123456");
        ls.login("","123456");
        ls.login(null,"123456");
        ls.login("Roy","");
        ls.login("Roy",null);
        ls.login(null,null);
        ls.login("","");
        ls.login("ro78","323");



    }
}
