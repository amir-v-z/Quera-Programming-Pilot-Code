import java.util.Scanner;

public class yakhdarchi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int T = input.nextInt();

        if (T > 100) {
            System.out.println("Steam");
        }
        else if (T < 0) {
            System.out.println("Ice");
        }
        else {
            System.out.println("Water");
        }

        input.close();
    }
}