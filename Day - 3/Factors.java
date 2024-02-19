import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = sc.nextInt();
        System.out.println("Factors of "+n+" are:");
        for(int i=1; i<=n; i++){
            int a= n%i;
            if(a == 0){
                System.out.println( i );
            }
        }
    }
}
