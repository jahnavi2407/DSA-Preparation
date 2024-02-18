import java.sql.SQLOutput;
import java.util.Scanner;
public class Figures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a shape: ");
        String shape = sc.nextLine();
        switch(shape){
            case "equilateral triangle":
                System.out.println("Enter base, height and side :");
                int b = sc.nextInt();
                int h = sc.nextInt();
                int a = sc.nextInt();
                float area = 0.5f * h * b;
                System.out.println("Area: "+area);
                int per1 = 3 * a;
                System.out.println("Perimeter:"+per1);
                break;
            case "rectangle":
                System.out.println("Enter length and breadth :");
                int l = sc.nextInt();
                int w = sc.nextInt();
                int area1 = l * w;
                System.out.println("Area: "+area1);
                int per = 2 *(l + w);
                System.out.println("Perimeter: "+per);
                break;
            case "parallelogram":
                System.out.println("Enter base, height and side :");
                int b1 = sc.nextInt();
                int h1 = sc.nextInt();
                int s1 = sc.nextInt();
                int area2 = b1 * h1;
                System.out.println("Area: "+area2);
                int per2 = 2 *(b1 + s1);
                System.out.println("Perimeter: "+per2);
                break;
            case "rhombus":
                System.out.println("Enter the diagonals and side :");
                int p = sc.nextInt();
                int q = sc.nextInt();
                int s2 = sc.nextInt();
                float area3 = 0.5f * p * q;
                System.out.println("Area: "+area3);
                int per3 = 4 * s2;
                System.out.println("Perimeter: "+per3);
                break;
            default:
                System.out.println("No data!!!");
        }
    }
}
