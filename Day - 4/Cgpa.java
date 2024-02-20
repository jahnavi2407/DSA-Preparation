import java.util.Scanner;
public class Cgpa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of semesters:");
        int n = sc.nextInt();
        System.out.println("Enter SGPA and total no. of credits:");
        float sgpa = 0;
        float cre = 0;
        for(int i=0; i<n; i++) {
            sgpa = sc.nextFloat();
            cre = sc.nextFloat();
        }
        float c = (cre * sgpa)/cre;
        float cgpa = ((cre * sgpa)/cre) + c;
        System.out.println("CGPA: "+cgpa);
    }
}
