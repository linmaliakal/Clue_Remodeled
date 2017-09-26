/**
 * Created by linmaliakal on 12/10/16.
 */
/* takes first string of the input of user
 * compares/checks to see if string is inside of String[] Suspects
 * take randomSuspect from RandomGenerator and sets it as an attribute of Suspects

p:  create a function that connects the random generator class to the suspect
    create a private string for answers
    create a public string to check answer

i:  No user input is needed

p:  Use function so that a suspect is randomly selected through the random generator
    Have selected suspect set as the answer and the user input be compared to the selected suspect
    .equals() method will be used to determine whether the user input and answer are equal

o: this class will be called upon in main
*/

public class Suspects {
    private RandomGenerator randomSuspect = new RandomGenerator();
    String answer = randomSuspect.randomSuspect();



    public void setRandomSuspect(RandomGenerator randomSuspect) {
        this.randomSuspect = randomSuspect;
    }

    public String checkRandSuspect(){
        return randomSuspect.randomSuspect();
    }
    //public static final String[] SUSPECTS = new String[] {"Col Mustard", "Ms Scarlet", "Mrs White", "Mrs Peacock", "Prof Plum"};
    //public String[] sGuesses;

    public boolean checkGuess(String suspectUserInput) {
        return answer.equals(suspectUserInput);

    }
}
