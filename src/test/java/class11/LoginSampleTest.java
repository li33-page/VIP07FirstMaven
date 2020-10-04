package class11;

import org.junit.*;

import static org.junit.Assert.*;

public class LoginSampleTest {

    static LoginSample ls;

    @BeforeClass
    public static void classSetUp(){
        System.out.println("-CCCCC--测试类开始执行前执行的方法");
        ls=new LoginSample();
    }
    @AfterClass
    public static void classTd(){
        System.out.println("-CCCCC--测试类执行结束后执行的方法");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("-M--每个测试方法开始执行前执行的方法");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("-M--每个测试方法执行后执行的的方法");
    }

    @Test
    public void login() {
        ls.login("Roy","123456");
        assertEquals("恭喜您，登录成功",ls.getMsg());
    }

    @Test
    public void loginMsg() {
        System.out.println("测试的结果是："+ls.getMsg());
    }

    @Test
    public void errorlogin(){
        ls.login(null,"ee");
        assertTrue(ls.getMsg().contains("为空"));
    }
}