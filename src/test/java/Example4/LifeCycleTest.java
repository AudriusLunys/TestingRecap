package Example4;

import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.*;


public class LifeCycleTest {

    @BeforeAll
    public static void setUp (){
        System.out.println("running before all teste");
    }

    @BeforeEach
    public void beforeEach (){
        System.out.println( "running before every test");
    }
    @AfterAll
    public static void tearDown (){
        System.out.println("runs after all tests");
    }

    @AfterEach
    public  void tearDownEach () {
        System.out.println("runs after each tests");
    }


    @Test
    public void testOne (){
        System.out.println("first test runs");
    }
    @Test
    public void testTwo (){
        System.out.println("second test runs");
    }

    @Disabled
    @Test
    public void toBeIgnored () {
        System.out.println("working but will be ignored");
    }


}
