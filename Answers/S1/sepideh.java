import java.util.Scanner;

public class sepideh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println((n+m-1)/m);

        input.close();
    }
}