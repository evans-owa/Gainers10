import java.util.Scanner;

public class MeW4 {
    public static void main(String[] args) {
        Scanner ke = new Scanner(System.in);

        System.out.print("Insert a number: ");

        int m = ke.nextInt();

        for (int i = 1; i<=m; i++){

            for (int j = 1; j<=m-i; j++)
                System.out.print(" ");

            for (int k= 1; k <= 2*i-1; k++)
                System.out.print("*");

            System.out.println();
        }
    }
}
