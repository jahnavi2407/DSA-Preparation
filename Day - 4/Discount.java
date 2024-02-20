import java.util.Scanner;
public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter provided discount: ");
        int pro_dis = sc.nextInt();
        float per_dis = pro_dis/100f;
        System.out.println("Enter the listing price: ");
        int list_price = sc.nextInt();
        float final_dis = list_price * per_dis;
        System.out.println("Discount of the product is: "+final_dis);
        float sell_price = list_price - final_dis;
        System.out.println("The selling price will be: "+sell_price);
    }
}
