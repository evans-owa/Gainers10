import java.util.Scanner;

public class MeW5 {
    public static void main(String[] args) {
        Scanner tr = new Scanner(System.in);

        System.out.print("insert a number: ");

        int le = tr.nextInt();

        for (int i = 1; i <= le; i++){
            for (int j = 1; j <= le - i; j++) // outside space
                System.out.print(" ");

            for (int k = 1; k <= 2 * i - 1; k++)
                if (i == le)
                    System.out.print("*");
                else
                    if (k == 1 || k == 2 * i - 1)
                        System.out.print("*");
                    else
                        System.out.print(" ");

            System.out.println();
        }
    }
}
