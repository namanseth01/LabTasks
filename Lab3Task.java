/*   Created by IntelliJ IDEA.
 *   Author: Naman Seth (namanseth01)
 *   Date: 27/07/20
 *   Time: 11:31 AM
 *   File: Lab3Task.java
 */

package labProblems;

import java.util.Scanner;

public class Lab3Task {
    public static final String DISCOUNT_CODE = "CoVid19";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String clientInputDiscountCode = scanner.nextLine();
        if (clientInputDiscountCode.isBlank() || clientInputDiscountCode.isEmpty()) {
            System.out.println("The coupon code cannot be blank or empty.");
        } else if (clientInputDiscountCode.equalsIgnoreCase(DISCOUNT_CODE)) {
            System.out.println("Congrats, you get ₹ 100 off on your bill!");
        } else {
            System.out.println("Coupon code is not valid....");
        }
    }
}