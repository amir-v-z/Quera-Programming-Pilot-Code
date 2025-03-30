import java.util.Scanner;

public class behdasht_salamat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int n = input.nextInt();

        if (n==0) {
            System.out.println(20);
        }
        else if (n==7) {
            System.out.println(x);
        }
        else if (n>7) {
            int z = x-n;
            if (z<=0) {
                System.out.println(0);
            }
            else {
                System.out.println(z);
            }
        }
        else {
            int q = x-n;
            if (q<=0) {
                System.out.println(0);
            }
            else{
                System.out.println(q);
            }
        }

        input.close();
    }
}