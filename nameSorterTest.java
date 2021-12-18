import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.Test;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class nameSorterTest {

    @Test
    public void testSuccessfulCase() throws Exception {
        Person p1 = new Person();
        p1.setFullName("Charlie Brown");
        Person p2 = new Person();
        p2.setFullName("Lucy Van Pelt");
               
        assertEquals(p1.getLastName(),"Brown");
        assertEquals(p2.getFirstName(), "Lucy Van");
    }
    
    @Test
    public void testNoGivenName() {
        Exception exception = assertThrows(Exception.class, () -> {
            Person p1 = new Person();
            p1.setFullName("Snoopy");
        });

        String expectedMessage = "A name must have at least 1 given name";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testTooManyGivenNames() {
        Exception exception = assertThrows(Exception.class, () -> {
            Person p1 = new Person();
            p1.setFullName("Kitching Josh Bennett Evolution Dreams");
        });

        String expectedMessage = "A name only up to 3 given names";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
