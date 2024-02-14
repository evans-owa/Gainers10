import java.util.Scanner;
// recap
public class MeW1 {
    public static void main(String[] args) {
        Scanner ke = new Scanner(System.in);

        String k = ke.nextLine();

        boolean  isPala = true;

        for (int i = 0, j = k.length()-1; i<j; i++, j--) {
            if (k.charAt(i) == k.charAt(j))
                continue;
            isPala = false;
            break;
        }
        System.out.println(isPala ? "paraladrom": "not paladrom");
    }
}
