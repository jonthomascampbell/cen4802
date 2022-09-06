
import java.util.*;

//Fibonacci Series using Recursion
//nth number = Sum of (n-1)th and (n-2)th numbers

public class Main
{

    public static int fibonacci(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main (String args[])
    {
        int n;
        Scanner snr = new Scanner(System.in);
        System.out.println("Enter a value to return the N-th term in the Fibonacci sequence: ");
        n=snr.nextInt();
        snr.close();
        System.out.println("\nThe "+n+"th term of the Fibonacci sequence is "+fibonacci(n) + "!");

    }
}

//Jon Campbell CEN 4802C