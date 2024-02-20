import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter a value: ");
        int n = sc.nextInt();
        for(int i=0; i<=n ; i++){
            sum = sum + i;
        }
        int avg = sum/n;
        System.out.println("Average of "+n+" is: "+avg);
    }
}
