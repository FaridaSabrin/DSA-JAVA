// Pattern number 

import java.util.*;  // Import Scanner class from util package
public class Ques_23{  // Define main class
    public static void main(String[] args){  // Main method - entry point
        Scanner sc = new Scanner(System.in);  // Create Scanner object to read input
        int n = sc.nextInt();  // Read integer input from user - determines number of rows
        
        int val = 1;  // Initialize counter variable starting at 1
        
        for(int i = 1; i <= n; i++){  // Outer loop for rows, runs from 1 to n
            for(int j = 1; j <= i; j++){  // Inner loop for columns in each row
                // Prints 'i' numbers in row 'i' (row 1: 1 number, row 2: 2 numbers, etc.)
                System.out.print(val + "\t");  // Print current value followed by tab
                val++;  // Increment value for next number to print
            }
            System.out.println();  // Move to next line after printing all numbers in current row
        }
    }
}