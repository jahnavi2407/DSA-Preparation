import java.util.Scanner;
public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("String given: "+word);
        String reverse = new StringBuffer(word).reverse().toString();
            if(word.equals(reverse)){
                System.out.println(word+ " is a palindrome");
            }
            else{
                System.out.println(word+ " is not a palindrome");
            }
    }
}
