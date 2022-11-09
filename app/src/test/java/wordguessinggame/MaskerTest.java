package wordguessinggame;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MaskerTest {

    @Test public void testGetsWordToGuess() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromArray()).thenReturn("BUILD");
        Game game = new Game(mockedChoser);
        Masker masker = new Masker(game);
        assertEquals(masker.getMaskedWord(game), "B____");
      }

    @Test public void testGetsWordToGuessTwo() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromArray()).thenReturn("MAKERS");
        Game game = new Game(mockedChoser);
        Masker masker = new Masker(game);

        assertEquals(masker.getMaskedWord(game), "M_____");
      }
      
    @Test public void testGetsWordToGuessWithRandomWord() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromArray()).thenReturn("DEVELOPER");
    Game game = new Game(mockedChoser);
    Masker masker = new Masker(game);

    assertEquals(masker.getMaskedWord(game), "D________");
    }

      @Test public void testGuessLetterRightAndDisplayGuessedLetter() {
      WordChoser mockedChoser = mock(WordChoser.class);
      when(mockedChoser.getRandomWordFromArray()).thenReturn("MAKERS");
  
      Game game = new Game(mockedChoser);
      Masker masker = new Masker(game);
  
      assertEquals(game.guessLetter('K'), true);
      assertEquals(masker.getMaskedWord(game), "M_K___");
    }
    
    @Test public void testGuessLetterWrong() {
      WordChoser mockedChoser = mock(WordChoser.class);
      when(mockedChoser.getRandomWordFromArray()).thenReturn("MAKERS");
  
      Game game = new Game(mockedChoser);
      Masker masker = new Masker(game);
  
      assertEquals(game.guessLetter('O'), false);
      assertEquals(masker.getMaskedWord(game), "M_____");
    }
}