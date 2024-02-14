import java.util.Scanner;

public class MeW2 {
    public static void main(String[] args) {
        Scanner me = new Scanner(System.in);

        System.out.print("Insert a number: ");

        int kem = me.nextInt();

        for (int i = 1; i<=kem; i++){  // printing row

            for (int j = 1; j<=i; j++) // what we  are printing inside each line

                System.out.print(i);
            System.out.println();
        }
    }

}
