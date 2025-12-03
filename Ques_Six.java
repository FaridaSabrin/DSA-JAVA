// you have to display the digits of a number in reverse
// take as input n the number for which digits have to be display in reverse
// Print the digits of the number line-wise but in reverse order 

import java.util.*;
public class Ques_six{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0){
            int dig = n%10;
            n = n / 10;
            System.out.println(dig);
        }



    }
}