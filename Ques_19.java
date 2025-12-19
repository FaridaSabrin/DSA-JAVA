// 1.you are given a number n.
// 2.You have to create a pattern of * and separated by tab as shown in ouput format.

import java.util.*;
public class Ques_19{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(i == j){
                    System.out.print("*\t");
                } else{
                    System.out.print("\t");
                }
            } 
            
            System.out.println();
        }
    }
}