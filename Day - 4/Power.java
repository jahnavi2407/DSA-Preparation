import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter work done: ");
        float work = sc.nextInt();
        System.out.println("Enter time taken: ");
        float time = sc.nextInt();
        float power = work/time;
        System.out.println("Power: "+power);
    }
}
