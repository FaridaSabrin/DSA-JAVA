// Hollow diamond print

import java.util.*;
public class Ques_22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Takes user input for the size of the diamond (odd number works best)

        int os = n/2;  // Initialize outer spaces - spaces before first star (half of n)
        int is = -1;   // Initialize inner spaces - spaces between stars (starts at -1 for edge case)

        for(int i = 1; i<=n; i++){  // Main loop for each row, runs 'n' times
            // System.out.print(os + "," + is);  // Debug line (commented out) - shows os and is values
            
            // Print leading outer spaces
            for(int j = 1; j<= os; j++){  
                System.out.print("\t");  // Prints tab spaces before the first star
            }
            
            System.out.print("*\t");  // Print the first star of the row
            
            // Print inner spaces between stars
            for(int j = 1; j<=is; j++){  
                System.out.print("\t");  // Prints tab spaces between the two stars
            }
            
            // Print second star (but not for first and last row)
            if(i > 1 && i < n){  
                System.out.print("*\t");  // Prints second star for all rows except first and last
            } 
            
            // Update space counters based on whether we're in upper or lower half of diamond
            if(i <= n/2){  // For upper half of diamond (including middle if n is odd)
                os--;      // Decrease outer spaces as we go down the upper half
                is+=2;     // Increase inner spaces by 2 as diamond widens
            } else {       // For lower half of diamond
                os++;      // Increase outer spaces as we go down the lower half
                is-=2;     // Decrease inner spaces by 2 as diamond narrows
            }
            
            System.out.println();  // Move to next line after printing each row
        }
    }
}