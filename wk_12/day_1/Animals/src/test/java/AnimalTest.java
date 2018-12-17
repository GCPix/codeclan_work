import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {
    private Animal animal;

    @Before
    public void setUp() throws Exception {
        animal = new Animal("giraffe");
    }

    @Test
    public void hasName() {
        assertEquals("giraffe", animal.getAnimalName());
    }

    @Test
    public void canSetName() {
        animal.setAnimalName("Lion");
        assertEquals("Lion", animal.getAnimalName());
    }


    @Test
    public void canEat() {
        assertEquals("giraffe is eating a leaves", animal.eat("leaves"));
    }

    @Test
    public void canBreathe() {
        assertEquals("giraffe is breathing", animal.breathe());
    }

}
