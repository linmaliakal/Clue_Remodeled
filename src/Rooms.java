/**
 * Created by linmaliakal on 12/10/16.
 */
/* takes second string of what user input
 * compares/checks to see if string is inside of String[] Rooms

 p: create a function that connects the random generator class to the rooms
    create a private string for answers
    create a public string to check answer

i:  No user input is needed

p:  Use function so that a room is randomly selected through the random generator
    Have selected room set as the answer and the user input be compared to the selected room
    .equals() method will be used to determine whether the user input and answer are equal

o:  this class will be called upon in main
*/
public class Rooms {
    private RandomGenerator randomRoom= new RandomGenerator();
    String answer = randomRoom.randomRooms();


    public void setRandomSuspect(RandomGenerator randomRoom) {
        this.randomRoom = randomRoom;
    }
    //public static final String[] ROOMS = new String[] {"kitchen", "ballroom", "library", "bathroom", "lounge"};
    //public String[] rGuesses;

    public boolean checkGuess(String roomUserInput){

        return answer.equals(roomUserInput);
    }
}
