import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+": "+(a+b));
    }
}
