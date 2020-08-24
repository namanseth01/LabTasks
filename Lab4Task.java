/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 01-Aug-20
 *   Time: 03:09 PM
 *   File: Lab4Task.java
 */

package labProblems;

import java.util.Scanner;

public class Lab4Task {
    // This is the total number of participants allowed in the conference.
    // DO NOT CHANGE/REMOVE THIS CODE.
    private static final byte TOTAL_PARTICIPANTS = 100;

    // This method will sell the ticket to the participant.
    // DO NOT CHANGE/REMOVE THIS CODE.
    private static void sellTicket(String participantName) {
        String message = "Congratulations, " + participantName + ". " + "See you at the conference!";
        System.out.println(message);
    }

    public static void main(String[] args) {
        byte numberOfTicketsSold = 0;
        while (numberOfTicketsSold <= TOTAL_PARTICIPANTS) {
            System.out.println("Total Tickets Left: " + (TOTAL_PARTICIPANTS - numberOfTicketsSold));
            System.out.print("Enter the name of participant: ");
            Scanner scannerObject = new Scanner(System.in);
            String participantName = scannerObject.nextLine();
            sellTicket(participantName);
            numberOfTicketsSold++;
            if (numberOfTicketsSold == TOTAL_PARTICIPANTS) {
                System.out.println("Sorry, The tickets are sold-out!");
                scannerObject.close();
                break;
            }
        }
    }
}