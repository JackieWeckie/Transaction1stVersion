
import java.util.Scanner;

/** This is the console-level program that imitate the real internet-transaction but ony in console
 * This is a fist version of my program. I will add some new code soon. Enjoy!
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the first 4 numbers of your card: ");
        Scanner scNum1 = new Scanner(System.in);
        int num1 = scNum1.nextInt();

        if (num1 >= 0000 && num1 <= 9999) {
            System.out.println("Done!");
        } else {
            System.out.println("Error! You didn't entered first 4 numbers of your card! Please try again!");
        }

        System.out.println("Enter the second 4 numbers of your card: ");
        Scanner scNum2 = new Scanner(System.in);
        int num2 = scNum2.nextInt();

        if (num2 >= 0000 && num2 <= 9999) {
            System.out.println("Done!");
        } else {
            System.out.println("Error! You didn't entered second 4 numbers of your card! Please try again!");
        }

        System.out.println("Enter the third 4 numbers of your card: ");
        Scanner scNum3 = new Scanner(System.in);
        int num3 = scNum3.nextInt();

        if (num3 >= 0000 && num3 <= 9999) {
            System.out.println("Done!");
        } else {
            System.out.println("Error! You didn't entered third 4 numbers of your card! Please try again!");
        }

        System.out.println("Enter the fourth 4 numbers of your card: ");
        Scanner scNum4 = new Scanner(System.in);
        int num4 = scNum4.nextInt();

        if (num4 >= 0000 && num4 <= 9999) {
            System.out.println("Done!");
        } else {
            System.out.println("Error! You didn't entered fourth 4 numbers of your card! Please try again!");
        }

        System.out.println("Enter the month your card will be valid to: ");
        Scanner monthSc = new Scanner(System.in);
        byte bMonth = monthSc.nextByte();

        if (bMonth >= 01 && bMonth <= 12) {
            System.out.println("Done!");
        } else {
            System.out.println("Error! You didn't entered a correct month number! Please try again!");
        }

        System.out.println("Enter the year your card will be valid to: ");
        Scanner yearSc = new Scanner(System.in);
        byte bYear = yearSc.nextByte();

        if (bYear >= 00 && bYear <= 99) {
            System.out.println("Done!");
        } else {
            System.out.println("Error! You didn't entered a correct year number! Please try again!");
        }

        System.out.println("Enter the cvc-code of your card (The 3 numbers from the back side): ");
        Scanner cvcSc = new Scanner(System.in);
        short cvc = cvcSc.nextShort();

        if (cvc >= 000 && cvc <= 999) {
            System.out.println("Done!");
        } else {
            System.out.println("Error! You didn't entered a three-digit code of your card (CVC)! Please try again!");
        }

        System.out.println("Your payment was done successfully! Thank you!");
    }
}