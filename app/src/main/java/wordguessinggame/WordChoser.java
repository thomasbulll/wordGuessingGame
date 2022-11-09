package wordguessinggame;

import java.util.Random;

public class WordChoser {

    public static final String[] DICTIONARY = {"MAKERS", "CANDIES", "DEVELOPER", "LONDON", "YELLOW", "VISION", "COMBAT", "CODING", "SOFTWARE",
     "BUILDING", "VENDOR", "UNIQUE", "THEORY", "ROBOTIC", "POLICE", "OXFORD", "GOOGLE", "FAMOUS"};
    
    public static void main(String[] args){

    }

    public String getRandomWordFromArray(){
        Random rand = new Random();
        return DICTIONARY[rand.nextInt(DICTIONARY.length)];
    }
    
}
