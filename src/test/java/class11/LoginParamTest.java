package class11;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LoginParamTest {

    static LoginSample ls;
    String user;
    String pwd;
    String expectedMsg;



    @BeforeClass
    public static void setUp(){
        ls=new LoginSample();
    }

    public LoginParamTest(String userParam,String pwdParam,String expectedMsgParam){
        user=userParam;
        pwd=pwdParam;
        expectedMsg=expectedMsgParam;

    }

    @Test
    public void testLogin(){
        ls.login(user,pwd);
        System.out.println(ls.getMsg());
        Assert.assertTrue(ls.getMsg().contains(expectedMsg));
    }

    @Parameterized.Parameters(name = "用户名:{0}, 预期结果是:{2}")
    public static Object[][] loginData(){
        return new Object[][]{
                {"Roy","123456","成功"},
                {null,"123456","为空"},
                {"r","123456","3-16位"},
                {"ro","123456","3-16位"},
                {"","123456","3-16位"},
                {"royy","123456","错误"}    };
    }
}


