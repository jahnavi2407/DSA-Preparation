import java.util.Scanner;
public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a>b){
            System.out.println(a+ " is a largest number");
        }
        else{
            System.out.println(b+" is a largest number.");
        }
    }
}
