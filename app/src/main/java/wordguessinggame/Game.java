package wordguessinggame;

import java.util.ArrayList;

public class Game {

    String word;
    Integer remaining_attempts = 10;
    public ArrayList<Character> guessedLetters = new ArrayList<Character>();

    public ArrayList<Character> getGuessedLetters(){
        return guessedLetters;
    }

    public Game( WordChoser wordChoser){
        word = wordChoser.getRandomWordFromArray();
    }

    public static void main(String[] args){
    }       

    public Boolean guessLetter(Character letter){
        String temp = Character.toString(letter);
        if(word.contains(temp)){
            guessedLetters.add(letter);
            return true;
        }else{
            remaining_attempts --;
            return false;
        }
    }

    public Boolean isGameWon(){
        for(int i=1; i<word.length(); i++){
            Character letter = word.charAt(i);
            if(guessedLetters.indexOf(letter) == -1){
                return false;
            }
        }
        return true;
    }

    public Boolean isGameLost(){
        if(remaining_attempts == 0){
            return true;
        }else{
            return false;
        }
    }



    
}
