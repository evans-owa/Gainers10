import java.util.Scanner;

public class MeW8 {
    public static void main(String[] args) {
        Scanner promo = new Scanner(System.in);

        System.out.print("insert a number: ");

        int kis = promo.nextInt();

        for (int i = 1; i <= kis; i++){  // iteration level
            if (i == 1 || i == kis) // check if in the firs line o the last line print full stars

                for(int j = 1; j <= kis; j++)
                    System.out.print("*");    // print if the above is true
            else
                for (int j = 1; j <= kis; j++)
                    if (j == 1 || j == kis)
                        System.out.print(" ");  // gives a space a at the start of each line and the ending of the line
                    else
                        System.out.print("*");
            System.out.println();
        }
    }
}