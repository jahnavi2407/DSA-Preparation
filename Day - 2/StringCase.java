import java.util.Scanner;
public class StringCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.nextLine().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        }
        else{
            System.out.println("UpperCase");
        }
    }
}
