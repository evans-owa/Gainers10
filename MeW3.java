import java.util.Scanner;

public class MeW3 {
    public static void main(String[] args) {
        Scanner mak = new Scanner(System.in);

        System.out.print("Enter a digit: ");

        int star = mak.nextInt();


        for (int i = 1; i <= star; i++) { //  iteration star time (number the user inserts)

            for (int j = 1; j <= star - i; j++) //  displaying the spaces (then destroyed)
                System.out.print(" ");

            for (int k= 1; k<=i; k++) // displaying the stars(*)
                System.out.print("*");
            System.out.println();
        }
    }
}
