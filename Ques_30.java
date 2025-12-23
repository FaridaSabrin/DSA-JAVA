// Design pattern 18 - This program prints a diamond-like pattern with hollow top half
import java.util.*;
public class Ques_30{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);  // Create Scanner object to read input
        int n = sc.nextInt();  // Read the total size/dimension from user input
        
        int st = n;  // Initialize number of stars to print in first row (st = star count)
        int sp = 0;  // Initialize number of spaces before stars (sp = space count)

        // Loop through each row from 1 to n
        for(int i = 1; i <= n; i++){
            
            // Print leading spaces for current row
            for(int j = 1; j<=sp; j++){
                System.out.print("\t");  // Print tab character for spacing
            }
            
            // Print stars (or spaces for hollow section) for current row
            for(int j = 1; j <= st; j++){
                // Condition to create hollow section: 
                // If row is in top half (but not first row) AND 
                // position is not first or last in the row
                if(i >1 && i <= n / 2 && j>1 && j<st){
                    System.out.print("\t");  // Print space for hollow section
                }else{
                    System.out.print("*\t");  // Print star for boundary
                }
            }
            
            // Update space and star counts for next row
            if(i <= n/2){
                sp++;    // Increase spaces for next row
                st-=2;   // Decrease stars by 2 for next row (creates narrowing effect)
            }else{
                sp--;    // Decrease spaces for next row
                st +=2;  // Increase stars by 2 for next row (creates widening effect)
            }
            
            System.out.println();  // Move to next line after finishing current row
        }
    }
}