import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hrs of usage: ");
        int h = sc.nextInt();
        System.out.println("Enter power: ");
        int p = sc.nextInt();
        int t = 30 * h;
        int e = (p * t)/1000;
        System.out.println("Cost per unit is Rs.3.");
        int bill = 3 * e;
        System.out.println("Electricity bill for 30 days is: "+bill);
    }
}
