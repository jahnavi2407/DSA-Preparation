import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int p = sc. nextInt();
        int t = sc. nextInt();
        int r = sc. nextInt();
        System.out.println("Principle p = " +p);
        System.out.println("Time T = " +t);
        System.out.println("Rate R = " +r);
        float si;
        si = ( float ) (p * t * r)/100;
        System.out.println("Simple Interest SI = " +si);
    }
}
