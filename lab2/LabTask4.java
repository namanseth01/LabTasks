/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 25-Jul-20
 *   Time: 8:56 PM
 *   File: LabTask4.java
 */

//Create a program in Java to demonstrate declaration, initialization and usage of static and non-static variables.

package labProblems.lab2;

// * non-static variable can only be accessed through object
// * static variable can only be accessed through class

public class LabTask4 {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();  //object -> laptop
        laptop.id = 5632489;                              //accessed through object
        laptop.companyName = "Lenovo";                    //accessed through object
        Laptop.price = 45_000.00f;                        //accessed through class
        Laptop.billNumber++;                              //accessed through class
        /* Laptop.laptopCompanyName = "Hp"; (error) */
        System.out.println("Laptop Id: " + laptop.id);
        System.out.println("Company: " + laptop.companyName);
        System.out.println("Price: " + Laptop.price);
        System.out.println("Bill Number: " + Laptop.billNumber);
    }
}

class Laptop {       //class -> Laptop
    static float price;                        //static variable
    static int billNumber = 50326500;
    int id;                                   //non-static variable
    String companyName;
}