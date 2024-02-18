import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("n= " +n);
        int a=0, b=1, c;
        if(n>0){
            for(int i=2; i<=n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
        }
        System.out.println("Fibonacci series for " +n+ " numbers is : "+b);
    }
}
