import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62, 'm');
    }

    @Test
    public void hasName(){

        assertEquals("Baloo", bear.getName());
    }

    @Test
    public void hasAge(){

        assertEquals(25, bear.getAge());
    }
    @Test
    public void hasWeight(){

        assertEquals(95.62, bear.getWeight(), 0.01);
    }
    @Test
    public void readyToHibernate(){
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80(){
        Bear thinBear = new Bear("stretch", 25, 60.22, 'f');
        assertEquals(false, thinBear.readyToHibernate());
    }
    @Test
    public void getGender(){
        assertEquals('m', bear.getGender());
    }
}
