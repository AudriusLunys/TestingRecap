package example2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class AssertTest {

    @Test
    public void assertTest (){
        String firstString= "Hi";
        String otherString ="Hi";
        assertEquals(firstString,otherString);

        boolean isTrue= true;
        assertTrue(isTrue);

        Double digit = 5.0;
        assertNotNull(digit);
        digit=null;
        assertNull(digit);

        Person person = new Person();
        Person otherPerson = new Person();
        assertNotSame(person, otherPerson);
        person = otherPerson;
        assertSame(person,otherPerson);

        String[] names = {"Tom", "Ben"};
        String[] otherNames = {"Tom","Ben"};
        assertArrayEquals(names,otherNames);

    }


}
