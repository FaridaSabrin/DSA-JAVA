// 1. You are required to display the prime factorization of a number
// 2. Take as input a number n.
// 3. Print all its prime factors from smallest to largest.

import java.util.*;               // Imports the Java utility package (needed for Scanner)

public class Ques_ten{            // Declares a public class named Ques_ten
    public static void main(String[] args){     // Main method where execution begins
        Scanner sc = new Scanner(System.in);    // Creates a Scanner object to read user input
        int n = sc.nextInt();                   // Reads an integer from the user and stores it in variable n

        // Loop through possible divisors starting from 2 up to n-1
        for(int div = 2; div < n; div++){
            
            // While the current divisor divides n evenly
            while(n % div == 0){
                n = n / div;                    // Divide n by the divisor
                System.out.print(div + " ");    // Print the divisor (a prime factor)
            }
        }

        // If after division n is not reduced to 1, it means n itself is a prime factor
        if(n != 1){
            System.out.print(n);                // Print the remaining prime factor
        }

    }
}
