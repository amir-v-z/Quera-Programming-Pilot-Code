import java.util.Scanner;

public class adad_khod_maghlob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String n = input.next();
        String reverse = new StringBuilder(n).reverse().toString();
        
        if (n.equals(reverse)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        input.close();
    }
}