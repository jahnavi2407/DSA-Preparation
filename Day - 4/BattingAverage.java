import java.util.Scanner;
public class BattingAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter runs scored: ");
        float runs = sc.nextInt();
        System.out.println("Enter times out: ");
        float times_out = sc.nextInt();
        float avg = runs/times_out;
        System.out.println("Batting average: "+avg);
    }
}
