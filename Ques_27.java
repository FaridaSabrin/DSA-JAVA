// design-pattern-15
// 1. You are given a number n.
// 2.You have to write code to print the pattern given in output format below

import java.util.*;  // Import Scanner class for user input
public class Ques_27{  // Define main class
    public static void main(String[] args){  // Main method - entry point
        Scanner sc = new Scanner(System.in);  // Create Scanner object to read input
        int n = sc.nextInt();  // Read integer input - determines pattern size
        
        int sp = n/2;  // Initialize spaces - starts with half of n (left padding)
        int st = 1;    // Initialize stars/numbers count - starts with 1
        int val = 1;   // Initialize starting value for the pattern
        
        for(int i = 1; i <= n; i++){  // Outer loop for each row, runs n times
            
            // Print leading spaces (left padding)
            for(int j = 1; j <= sp; j++){
                System.out.print("\t");  // Print tab spaces for alignment
            }
            
            int cval = val;  // Create temporary variable to track current row's starting value
            
            // Print numbers in the current row
            for(int j = 1; j <= st; j++){
                System.out.print(cval + "\t");  // Print current number with tab
                
                // Logic to increase then decrease numbers within the same row
                if(j <= st/2) {  // For first half of numbers in the row
                   cval++;  // Increment number
                } else {    // For second half of numbers in the row
                    cval--;  // Decrement number
                }
            }
            
            // Update counters based on whether we're in upper or lower half
            if(i <= n/2){  // Upper half (including middle row if n is odd)
                sp--;    // Decrease spaces (pattern widens)
                st+=2;   // Increase numbers count by 2 (pattern gets wider)
                val++;   // Increase starting value for next row
            } else {     // Lower half
                sp++;    // Increase spaces (pattern narrows)
                st-=2;   // Decrease numbers count by 2 (pattern gets narrower)
                val--;   // Decrease starting value for next row
            }
            
            System.out.println();  // Move to next line after printing row
        }
    }
}