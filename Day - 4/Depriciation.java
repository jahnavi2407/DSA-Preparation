import java.util.Scanner;
public class Depriciation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost of fixed asset: ");
        int cost = sc.nextInt();
        System.out.println("Enter salvage value: ");
        int sal = sc.nextInt();
        System.out.println("Enter useful life assumption: ");
        int life = sc.nextInt();
        int dep = (cost*sal/life);
        System.out.println("Accumulated depriciation: "+dep);
    }
}
