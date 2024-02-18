import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b = ");
        int b = sc.nextInt();
        System.out.println("enter an operator: ");
        char ch = sc.next().trim().charAt(0);
        switch(ch){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            default:
                System.out.println("No Data!!!");
        }
    }
}
