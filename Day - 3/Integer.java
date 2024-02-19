import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        int pro = 1, sum = 0, r;
        while(n>0){
            r= n%10;
            sum = sum + r;
            pro = pro * r;
            n= n/10;
        }
        System.out.println("Sum of the digits in the given integer: "+sum);
        System.out.println("Product of the digits in the given integer: "+pro);
        int sub = pro - sum;
        System.out.println("The result by subtracting the product from sum is: "+sub);
    }
}
