import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        int sum1 = 0, sum2 = 0, r, n = a, m= b;
        while(n>0){
            r = n%10;
            sum1 = sum1 + (r * r * r);
            n = n/10;
        }
        if(a == sum1){
            System.out.println(a+" is an armstrong number");
        }
        while(m>0){
            r = m%10;
            sum2 = sum2 + (r * r * r);
            m = m/10;
        }
        if(b==sum2){
            System.out.println(b+" is an armstrong number");
        }
    }
}
