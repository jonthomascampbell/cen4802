
import java.util.*;

/**
 * Fibonacci Series using Recursion.
 * This program prompts the user to enter an index and computes
 * the Fibonacci number for that index using recursion.
 *
 *@author joncampbell
 */
public class Main {

    /**
     * Compute fibonacci from user input
     * <p>
     *     Main method prompts user to enter n-th, and calls the Fibonacci method for the nth argument
     * </p>
     *
     * @param args the integer to be calculated
     */

    public static void main(String[] args) {
        int n;
        //Creates a scanner
        Scanner snr = new Scanner(System.in);
        System.out.println("Enter a value to return the N-th term in the Fibonacci sequence: ");
        n = snr.nextInt();
        snr.close();
        //Find and display the Fibonacci number
        System.out.println("\nThe Fibonacci number at index " + n + " is " + fibonacci(n) + ".");

    }

    /**
     * The method for finding the Fibonacci number
     * @param n the integer to be calculated
     * @return Method returns computed Fibonacci for n-th index
     */
    public static long fibonacci(long n) {
        if (n == 0) return 0;
        else if (n == 1)
            return 1;
       else //Reduction and recursive calls
           return fibonacci(n - 1) + fibonacci(n - 2);
    }
}


