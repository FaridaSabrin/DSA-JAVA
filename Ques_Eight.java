// 1. You are given two numbers n and k you are required to rotate n. k times to the right if k
// is positive rotate to the right i.e.removed rightmost digit and make it leftmost.
//  Do the reverse for negative value of k Also k can have an absolute value larger than number of digits in n.

// 2.Take as input n and k 

// 3.Print the rotated number

// 4.Note-Assume that the number of rotations will not cause leading 0's in the result.
// e.g.Such an input will not be given 
// n- 12340056
// k-3
// r-05612340

import java.util.*;
public class Ques_Eight{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int temp = n;
        int nod = 0;
        while(temp > 0){
            temp = temp/10;
            nod++;
        }

        k = k % nod;
        if (k < 0){
            k = k + nod;
        }

        int div = 1;
        int mult = 1;
        for(int i = 1; i<= nod; i++){
            if(i <= k){
                div = div * 10;
            }else {
                mult = mult * 10;
            }
        }
        
        int q = n/div;
        int r = n%div;

        int rot = r * mult + q;
        System.out.println(rot);
    }
}