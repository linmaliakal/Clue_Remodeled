/**
 * Created by linmaliakal on 12/10/16.
 */
/* takes third string of what user input
 * compares/checks to see if string is inside of String[] Weapons

p:  Create a function that connects the random generator class to the weapons
    create a private string for answers
    create a public string to check answer

i:  No user input is needed

p:  Use function so that a weapon is randomly selected through the random generator
    Have selected weapon set as the answer and the user input be compared to the selected weapon
    .equals() method will be used to determine whether the user input and answer are equal

o:  this class will be called upon in main
*/
public class Weapons {
    private RandomGenerator randomWeapons = new RandomGenerator();
    String answer = randomWeapons.randomWeapons();


    public void setRandomSuspect(RandomGenerator randomWeapons) {
        this.randomWeapons = randomWeapons;
    }
    //public static final String[] WEAPONS = new String[] {"candlestick", "rope", "knife", "revolver", "wrench"};
    //public String[] wGuesses;

    public boolean checkGuess(String weaponUserInput){

        return answer.equals(weaponUserInput);
    }

}
