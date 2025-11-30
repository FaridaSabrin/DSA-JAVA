import java.util.*;
public class Ques_one{
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int marks = scn.nextInt();  

        if(marks > 90){
            System.out.println("Excellent");
        }
        else if(marks > 80){
            System.out.println("good");
        }
        else if(marks > 70){
            System.out.println("fair");
        }
        else if(marks > 60){
            System.out.println("meet expectations");
        }
        else {
            System.out.println("below par");
        }
    }
}