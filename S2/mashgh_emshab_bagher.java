import java.util.Scanner;

public class mashgh_emshab_bagher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        if (x==0 || y==0 || z==0) {
            System.out.println("No");
        }
        else if (x+y+z==180) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        input.close();
    }
}