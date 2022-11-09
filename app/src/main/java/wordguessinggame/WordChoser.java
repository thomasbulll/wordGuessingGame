package wordguessinggame;

import java.util.Random;

public class WordChoser {

    public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON"};
    
    public static void main(String[] args){

    }

    public String getRandomWordFromArray(){
        Random rand = new Random();
        return DICTIONARY[rand.nextInt(DICTIONARY.length)];
    }
    
}
