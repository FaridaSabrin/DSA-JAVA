// 1.You are given a number n.
// 2. You have to create a pattern of * and Separated by tab as shown in output format.

import java.util.*;
public class Ques_18{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int st = n/2 + 1;
        int sp =1;
        for(int i = 1; i<=n; i++){
           for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }

            for(int j=1; j<=sp; j++){
                System.out.print("\t");
            }
            for(int j=1; j<=st; j++){
                System.out.print("*\t");
            }
            if (i <= n/2){
                st--;
                sp+=2;
            }else{
                st++;
                sp-=2;
            }
            System.out.println();
        }
    }
}