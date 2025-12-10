// 1. You are required to check if a given set of numbers is a valid pythagorean triplet.
// 2. Take as input three numbers a, b and c.
// 3. Print true if they can form a pythagorean triplet and false otherwise.

import java.util.*;
public class Ques_Eleven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;
        if(b >= max){
            max = b;
        }
        if(c >= max){
            max = c;
        }
        if(max == a){
            boolean flag = ((b * b + c * c) == (a * a));
            System.out.println(flag);

        }else if(max == b){
            boolean flag = ((a * a + c * c) == (b * b));
            System.out.println(flag);
        }else{
            boolean flag = ((a * a + b * b) == (c * c));
            System.out.println(flag); 
        }

    }
}