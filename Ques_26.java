// 1. You are given a number n.
// 2. You have to write code to print it's multiplication table up to 10 in format given below.

import java.util.*;
public class Ques_26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            int val = x * i;
            System.out.println(x + " * " + i + " = " + val);
        }
    }
}