import java.util.*;

public class Ques_35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // number
        int b1 = sc.nextInt();  // source base
        int b2 = sc.nextInt();  // destination base

        int result = getValue(n, b1, b2);
        System.out.println(result);

        sc.close();
    }

    public static int getValue(int n, int b1, int b2) {
        int decimal = anybasetodecimal(n, b1);
        int answer = decimaltoanybase(decimal, b2);
        return answer;
    }

    // converts any base number to decimal
    public static int anybasetodecimal(int n, int b) {
        int rv = 0;
        int p = 1;

        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv += dig * p;
            p = p * b;
        }
        return rv;
    }

    // converts decimal number to any base
    public static int decimaltoanybase(int n, int b) {
        int rv = 0;
        int p = 1;

        while (n > 0) {
            int dig = n % b;
            n = n / b;
            rv += dig * p;
            p = p * 10;
        }
        return rv;
    }
}
