import Players.User;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    User user;

    @Before
    public void setUp() throws Exception {
        user = new User("Gillian");
    }

    @Test
    public void hasName() {
        assertEquals("Gillian", user.getName());
    }
}
