import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;


public class WordCollectionTest {

    private WordCollection myWords;

    @Before
    public void before(){
        myWords = new WordCollection();
        myWords.add("awesome");
    }

    @Test
    public void canGetWordCountIsZero(){
        assertEquals(5, myWords.getWordCount());
    }
    @Test
    public void canAddToArray(){
        this.myWords.add("awesome");

    }
    @Test
    public void canReadArray(){
        assertEquals("awesome", this.myWords.get(0));
    }
}
