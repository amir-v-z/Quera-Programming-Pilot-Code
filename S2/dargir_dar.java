import java.util.Scanner;

public class dargir_dar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int widthDoor = input.nextInt();
        int heightDoor = input.nextInt();

        int widthMasoud = input.nextInt();
        int heightMasoud = input.nextInt();

        if (widthMasoud <= widthDoor && heightMasoud <= heightDoor) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        
        input.close();
    }
}