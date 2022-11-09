package wordguessinggame;

import java.util.ArrayList;

public class Masker{

    String word;

    public Masker(Game game){
        word = game.word;
    }

    public static void main(String[] args){
    }

    public String getMaskedWord(Game game) {
        ArrayList<Character> guessedLetters = game.getGuessedLetters();
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < this.word.length(); i++) {
            Character currentLetter = word.charAt(i);
            if (i == 0) {
                builder.append(currentLetter);
            } else {
                if (guessedLetters.indexOf(currentLetter) != -1) {
                    builder.append(currentLetter);
                } else {
                    builder.append("_");
                }
            }
        }

        return builder.toString();
    }



    
}
