package class11;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoginSampleTestMsg {

    static LoginSample ls;
    @BeforeClass
    public static void classSetUp(){
        ls=new LoginSample();
    }

//    @Before

    @Test
    public void loginMsg(){
        ls.login("Roy","123456");
        System.out.println("测试结果是："+ls.getMsg());
    }


}
