package wordguessinggame;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class GameTest {

      @Test public void gameIsCreatedWithRightAttempts() {
        WordChoser mockedChoser = mock(WordChoser.class);
        when(mockedChoser.getRandomWordFromArray()).thenReturn("DEVELOPER");
        Game game = new Game(mockedChoser);
        assertEquals(game.remaining_attempts, Integer.valueOf(10));
      }

    @Test public void testIsWon() {
      WordChoser mockedChoser = mock(WordChoser.class);
      when(mockedChoser.getRandomWordFromArray()).thenReturn("TEA");
  
      Game game = new Game(mockedChoser);
      game.guessLetter('T');
      game.guessLetter('E');
      game.guessLetter('A');
  
      assertEquals(game.isGameWon(), true);
  }
  
  @Test public void testIsWonWithSpecialWord() {
      WordChoser mockedChoser = mock(WordChoser.class);
      when(mockedChoser.getRandomWordFromArray()).thenReturn("COOL");
  
      Game game = new Game(mockedChoser);
      game.guessLetter('C');
      game.guessLetter('O');
      game.guessLetter('L');
  
      assertEquals(game.isGameWon(), true);
  }

  @Test public void testIsLostWithSpecialWord() {
    WordChoser mockedChoser = mock(WordChoser.class);
    when(mockedChoser.getRandomWordFromArray()).thenReturn("HOWDY");

    Game game = new Game(mockedChoser);
    game.guessLetter('C');
    game.guessLetter('O');
    game.guessLetter('P');
    game.guessLetter('T');
    game.guessLetter('L');
    game.guessLetter('X');
    game.guessLetter('Z');
    game.guessLetter('N');
    game.guessLetter('Q');
    game.guessLetter('G');
    game.guessLetter('K');

    assertEquals(game.isGameLost(), true);
}
}
