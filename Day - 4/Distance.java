import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter co-ordinates of 1st point: ");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        System.out.println("Enter co-ordinates of 2st point: ");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        double dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The distance between two points is: "+dis);
    }
}
