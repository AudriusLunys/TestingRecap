package example1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class basicServiceTest {

    @Test
    public void testBasicMethod (){
        BasicService basicService = new BasicService();
        String actualResult = basicService.basicMethod();
        assertEquals("BasicString",actualResult);
    }

    @Test
    public void testJoinStringsMethod () {
        BasicService basicService = new BasicService();
        String name="audrius";
        String lastName="lunys";
        String result= basicService.joinStringsMethod("audrius","lunys");
        assertEquals("audriuslunys",result);

        result=basicService.joinStringsMethod("audrius",null);
        assertEquals("audrius",result);

        result=basicService.joinStringsMethod(null,"lunys");
        assertEquals("lunys",result);
    }
}
