package wordguessinggame;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Arrays;

public class WordChooserTest {

    @Test public void itShouldContainADictionary(){
        WordChoser wordChoser = new WordChoser();
        String[] DICT = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};

        assertTrue(Arrays.asList(DICT).contains(wordChoser.getRandomWordFromArray()));
    }
    
}
