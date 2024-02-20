import java.util.Scanner;
public class Commision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total sales: ");
        int ts = sc.nextInt();
        System.out.println("Enter commision rate: ");
        int cr = sc.nextInt();
        int com = ts * cr/100;
        System.out.println("Commision percentage: "+com+"%");
    }
}
