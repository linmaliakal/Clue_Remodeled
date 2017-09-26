/**
 * Created by linmaliakal on 12/10/16.
 */
/* p: import scanner for user input
    3 strings for each of the guesses  (rooms, suspects, and weapons)
    4 boolean variables for correct answer of each of the three categories and for gameOver
    int variable for number of turns it took the user to win

i:  input new scanner,
    S.O.P line telling user what the game is, what their aim is, and what to choose from
    S.O.P lines in the loop for the choices the user has to guess from for the three categories (room, weapons, suspects)
    printing out if you have the room right

p:  compare String objects in ArrayList to String inputted by user and remove from ArrayList once used
        - .equals to compare String and .remove to get rid of String from ArrayList
    use checkGuess0 for Suspects class, checkGuess1 for Rooms class, checkGuess2 for Weapons class
    use while loop to give the correct number of turns it takes
    use if loop to check the guess the user has inputted and compare it to the randomly chosen answer for each of the categories
    create if else statements for possibilities of each answer

o:  tell user to guess again
    state they won and how many turns it took them to get the correct answer
*/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input;
        String susGuess;
        String roomGuess;
        String weapGuess;
        String playAgain;
        ArrayList<String> sus = new ArrayList<>();
        ArrayList<String> room = new ArrayList<>();
        ArrayList<String> weap = new ArrayList<>();
        String[] suspects = {"Col Mustard", "Ms Scarlet", "Mrs White", "Mrs Peacock", "Prof Plum"};
        String[] rooms = {"kitchen", "ballroom", "library", "bathroom", "lounge"};
        String[] weapons = {"candlestick", "rope", "knife", "revolver", "wrench"};
        boolean gameOver;
        boolean correctSus;
        boolean correctRoom;
        boolean correctWeap;
        gameOver = false;
        correctSus = false;
        correctRoom = false;
        correctWeap = false;
        int turns = 0;

        for (int i = 0; i < suspects.length; i++) {
            sus.add(suspects[i]);
        }
        for (int i = 0; i < rooms.length; i++) {
            room.add(rooms[i]);
        }
        for (int i = 0; i < weapons.length; i++) {
            weap.add(weapons[i]);
        }

        input = new Scanner(System.in);
        System.out.println("**********************\nWelcome to game of Clue! Your goal is to guess the perpetrator, the weapon they used, and the room they killed the owner of the house in.\nYou will be given three different series of choices which you choose one answer per each one.\nGood Luck!\n**********************");
        //System.out.println("Please enter a suspect, room, and weapon in that order. Choose from the lists below and type the names as they appear.\nSuspects: Col Mustard, MWeapons: candlestick, rope, knife, revolver, wrench");
/*
        the following statements reveal the answer

        RandomGenerator myRand = new RandomGenerator();
        System.out.println(myRand.randomSuspect());
        System.out.println(myRand.randomRooms());
        System.out.println(myRand.randomWeapons());
*/
        Suspects checkGuess0 = new Suspects();
        Rooms checkGuess1 = new Rooms();
        Weapons checkGuess2 = new Weapons();
        //public boolean replayGame() {
           while (!gameOver) {
               turns++;
               if (!correctSus) {
                   System.out.print("Suspects: ");
                   System.out.println(Arrays.toString(sus.toArray()));
                   System.out.println("Please choose a suspect from the list above and type the name as it appears: ");
                   susGuess = input.nextLine();
                   //susGuess = susGuess.replaceAll(".", "");
                   //if (susGuess = sus index 1) remove sus index 1
                   if (susGuess.equals("Col Mustard")) {
                       sus.remove("Col Mustard");
                   }
                   if (susGuess.equals("Ms Scarlet")) {
                       sus.remove("Ms Scarlet");
                   }
                   if (susGuess.equals("Mrs White")) {
                       sus.remove("Mrs White");
                   }
                   if (susGuess.equals("Mrs Peacock")) {
                       sus.remove("Mrs Peacock");
                   }
                   if (susGuess.equals("Prof Plum")) {
                       sus.remove("Prof Plum");
                   }
                   correctSus = checkGuess0.checkGuess(susGuess);
               } else if (correctSus) {
                   System.out.println("You have the Suspect correct!");
               }
               if (!correctRoom) {
                   System.out.print("Rooms: ");
                   System.out.println(Arrays.toString(room.toArray()));
                   System.out.println("Please choose a room from the list above and type the room as it appears: ");
                   roomGuess = input.nextLine();
                   //roomGuess = roomGuess.replaceAll(".", "");
                   if (roomGuess.equals("kitchen")) {
                       room.remove("kitchen");
                   }
                   if (roomGuess.equals("ballroom")) {
                       room.remove("ballroom");
                   }
                   if (roomGuess.equals("library")) {
                       room.remove("library");
                   }
                   if (roomGuess.equals("bathroom")) {
                       room.remove("bathroom");
                   }
                   if (roomGuess.equals("lounge")) {
                       room.remove("lounge");
                   }
                   correctRoom = checkGuess1.checkGuess(roomGuess);
               } else if (correctRoom) {
                   System.out.println("You have the Room right!");
               }
               if (!correctWeap) {
                   System.out.print("Weapons: ");
                   System.out.println(Arrays.toString(weap.toArray()));
                   System.out.println("Please choose a weapon from the list above and type the room as it appears: ");
                   weapGuess = input.nextLine();
                   //weapGuess = weapGuess.replaceAll(".", "");
                   if (weapGuess.equals("candlestick")) {
                       weap.remove("candlestick");
                   }
                   if (weapGuess.equals("rope")) {
                       weap.remove("rope");
                   }
                   if (weapGuess.equals("knife")) {
                       weap.remove("knife");
                   }
                   if (weapGuess.equals("revolver")) {
                       weap.remove("revolver");
                   }
                   if (weapGuess.equals("wrench")) {
                       weap.remove("wrench");
                   }
                   correctWeap = checkGuess2.checkGuess(weapGuess);
               } else if (correctWeap) {
                   System.out.println("You have the Weapon right!");
               }
               if (correctRoom && correctSus && correctWeap)
                   gameOver = true;
           }
           //} for replayGame

        System.out.println("CONGRATULATIONS! YOU SOLVED THE MYSTERY!!\nYOU WON IN " + turns + " TURNS!!!!");

        System.out.println("Would you like to play again? Enter yes or no.");
        playAgain = input.nextLine();
        if (playAgain.equals("yes")) {
            //return main(); //replay program
            }
        if (playAgain.equals("no")) {
            System.out.println("Thanks for playing!");
            }
    }
}
