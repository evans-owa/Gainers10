import java.util.Scanner;

public class MeW7 {
    public static void main(String[] args) {
        Scanner promo = new Scanner(System.in);

        System.out.print("insert a number: ");

        int kis = promo.nextInt();

        for (int i = 1; i <= kis; i++){  // iteration leval
            if (i == 1 || i == kis) // check if in the firs line o the last line print full stars

                for(int j = 1; j <= kis; j++)
                    System.out.print("*");    // print if the above if is true
            else
                for (int j = 1; j <= kis; j++)
                    if (j == 1 || j == kis)
                        System.out.print("*");  // prints star at the begin of a line and the last part of a line
                else
                        System.out.print(" ");
            System.out.println();


        }
    }
}
