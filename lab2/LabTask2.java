/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 25-Jul-20
 *   Time: 8:08 PM
 *   File: LabTask2.java
 */

//Create a program in Java to create local variables with the var keyword.
// Assign the value of all 8 primitive data types to 8 variables.

package labProblems.lab2;

public class LabTask2 {
    public static void main(String[] args) {
        var studentClassRollNUmber = (byte) 42;
        var studentHostelRoomNumber = (short) 1052;
        var studentUniversityRollNumber = (int) 565693;
        var studentSection = (char) 'K';
        var studentContactNumber = (long) 8633251336l;
        var studentCurrentCpi = (float) 8.46f;
        var studentAttendancePercentage = (double) 93.4;
        var isStudentOptedDcs = (boolean) true;
        System.out.println("Student Info: ");
        System.out.println("University Roll NUmber: " + studentUniversityRollNumber);
        System.out.println("Section: " + studentSection);
        System.out.println("Class Roll Number: " + studentClassRollNUmber);
        System.out.println("Contact Number: " + studentContactNumber);
        System.out.println("Attendance: " + studentAttendancePercentage);
        System.out.println("CPI: " + studentCurrentCpi);
        System.out.println("Opted DCS: " + isStudentOptedDcs);
        System.out.println("Hostel Room Number: " + studentHostelRoomNumber);
    }
}