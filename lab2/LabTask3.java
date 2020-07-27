/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 25-Jul-20
 *   Time: 8:43 PM
 *   File: LabTask3.java
 */

//Create a program in Java to demonstrate declaration, initialization and usage of local variables.

package labProblems.lab2;

public class LabTask3 {
    public static void main(String[] args) {
        Sports sport = new Sports();
        sport.cricket();
        sport.kabaddi();
    }
}

//local variable can only be accessed within in the block of the method in which it's declared

class Sports{
    void cricket(){
        byte numberOfPlayers = 11;     //local variable to cricket() method
        String nameOfCaptain = "Virat Kohli";   //local variable to cricket() method
        /* short overs = totalTimeOfGameInMinutes + 10; (error)*/
        System.out.println("Number of players: " + numberOfPlayers + " Captain: " + nameOfCaptain);
    }
    void kabaddi(){
        /* int numberOfPlayersOnTheMat = numberOfPlayers - 4; (error) */
        //variable 'numberOfPlayers' can be accessed within it's own block
        short numberOfPlayersOnTheMat = 7;      //local variable to kabaddi() method
        String nameOfCaptain = "Anup Kumar";    //local variable to kabaddi() method
        byte totalTimeOfGameInMinutes = 40;     // local variable to kabaddi() method
        System.out.println("Number of players: " + numberOfPlayersOnTheMat + " Captain: " + nameOfCaptain + " Total time of game(in minutes): " + totalTimeOfGameInMinutes);
    }
}

