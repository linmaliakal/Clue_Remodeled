/**
 * Created by linmaliakal on 12/10/16.
 */
/* Generate random answers for each of the three classes
 * No need for array of answers, because will pick randomly one of 5 possibilities?
 * then the random answer picked for possibilities will be assigned to a string variable which will be compared to what user inputs
p:  import Random
    create 3 private string attribute for weapons, rooms, and suspects possibilities and a private random
    create RandomGenerator function
    create 3 public three string methods for each of the random answers

i:  No user input is needed

p:  random generator should select an answer from the list in each of the strings
    this.random method should call upon the random generator
    Use method .length to get length of private string to be used in

o:  This class will be called upon in main, suspects, rooms, and weapons
 */
import java.util.Random;

public class RandomGenerator {
    private String[] SUSPECTS = {"Col Mustard", "Ms Scarlet", "Mrs White", "Mrs Peacock", "Prof Plum"};
    private String[] ROOMS =  {"kitchen", "ballroom", "library", "bathroom", "lounge"};
    private String[] WEAPONS =  {"candlestick", "rope", "knife", "revolver", "wrench"};
    private Random random;

    public RandomGenerator() {
        this.random = new Random();

        //System.out.println(mySuspect);
        //int indexRooms = random.nextInt(ROOMS.length);
        //int indexWeapons = random.nextInt(WEAPONS.length);
    }

    public String randomSuspect() {
        int indexSuspects = random.nextInt(SUSPECTS.length);
        String mySuspect = SUSPECTS[indexSuspects];
        return mySuspect;
    }

    public String randomRooms() {
        int indexRooms = random.nextInt(ROOMS.length);
        String myRoom = ROOMS[indexRooms];
        return myRoom;
    }

    public String randomWeapons() {
        int indexWeapons = random.nextInt(WEAPONS.length);
        String myWeapon = WEAPONS[indexWeapons];
        return myWeapon;
    }
}
