import java.util.Scanner;

public class jame_donbaleh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double a0 = input.nextInt();
        float d = input.nextInt();
        float n = input.nextInt();

        float x1 = n / 2;
        double x2 = 2 * a0;
        float x3 = n - 1;
        float x4 = x3 * d;
        double x5 = x2 + x4;

        double Sn = x1 * x5;

        System.out.printf("%.0f",Sn);

        input.close();
    }
}

// Formula
// Sn = n/2 * (2a0 + (n-1)d)