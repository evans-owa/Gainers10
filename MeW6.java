import java.util.Scanner;

public class MeW6 {
    public static void main(String[] args) {
        Scanner omi = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int memoryFormat = omi.nextInt();

        for (int i = 1; i<=memoryFormat; i++){
            for (int j = 1; j<=memoryFormat; j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
