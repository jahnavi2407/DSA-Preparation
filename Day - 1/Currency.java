import java.util.Scanner;
public class Currency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupees = sc.nextInt();
        System.out.println("Currency in rupees: "+rupees);
        float usd = rupees * 0.012f;
        System.out.println("Currency in USD: "+usd);
    }
}
