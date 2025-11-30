import java.util.*;
public class input{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // for (int i=0; i<=n; i++){
        //     System.out.println(i);
        // }
        // String name =sc.nextLine();

        // System.out.println("Hello " + name );

        // integer and String combine 
        int n = Integer.parseInt(sc.nextLine());
        String name = sc.nextLine();

        System.out.println("Dear" + name + "Here is the numbers");
         for (int i=0; i<=n; i++){
             System.out.println(i);
         }
    }
}