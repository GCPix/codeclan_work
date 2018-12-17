import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person person;
    @Before
    public void setUp() throws Exception {
        person = new Person("Joe", "G8");
    }

    @Test
    public void canGetName() {
        assertEquals("Joe", person.getName());
    }

    @Test
    public void canSetName() {
        person.setName("Gillian");
        assertEquals("Gillian", person.getName());
    }

    @Test
    public void canGetCohort() {
        assertEquals("G8", person.getCohort());
    }

    @Test
    public void canSetCohort() {
        person.setCohort("G9");
        assertEquals("G9", person.getCohort());
    }

    @Test
    public void canTalk() {

        assertEquals("I Love Lucy", person.talk("Lucy"));
    }
}
