import org.junit.*;

public class MyClass {

    @BeforeClass
    public static void init(){
        System.out.println("init");
    }

    @Before
    public void setUp(){
        System.out.println("Set up");
    }

    @Test
    public void test1(){
        System.out.println("Hello world!");
    }

    @After
    public void tearDown(){
        System.out.println("Tear down");
    }

    @AfterClass
    public static void destroy(){
        System.out.println("Destroy");
    }

}
