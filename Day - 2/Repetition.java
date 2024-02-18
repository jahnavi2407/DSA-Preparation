public class Repetition {
    public static void main(String[] args) {
        int n = 1211, i = 0;
        while(n>0){
            int r = n%10;
            if(r==1){
                i++;
            }
            n=n/10;
        }
        System.out.println(i);
    }
}
