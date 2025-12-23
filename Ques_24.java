// design-pattern-12

import java.util.*;  // Import Scanner class for user input
public class Ques_24{  // Define main class
    public static void main(String[] args){  // Main method - entry point
        Scanner sc = new Scanner(System.in);  // Create Scanner object to read input
        int n = sc.nextInt();  // Read integer input from user - number of rows
        
        int a = 0;  // Initialize first Fibonacci number (F0)
        int b = 1;  // Initialize second Fibonacci number (F1)
        
        for(int i = 1; i <= n; i++){  // Outer loop for rows, runs from 1 to n
            for(int j = 1; j <= i; j++){  // Inner loop for columns in each row
                // Prints 'i' Fibonacci numbers in row 'i'
                System.out.print(a + "\t");  // Print current Fibonacci number with tab
                
                // Calculate next Fibonacci number using Fibonacci sequence formula
                int c = a + b;  // Next Fibonacci number = sum of previous two
                a = b;  // Update 'a' to previous 'b' (shift one position forward)
                b = c;  // Update 'b' to the newly calculated Fibonacci number
            }
            System.out.println();  // Move to next line after printing row
        }
    }
}