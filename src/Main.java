import java.util.Scanner;
public class Main {
   static int i=2;

    public static boolean isAsal(int a) {
        if (a == 1 || a == 2 || a == 3)
            return true;
        if (a % i == 0)
            return false;
        i++;
        if (i < a) {
            return isAsal(a);
        } else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        do {
            System.out.print("Lütfen bir sayı giriniz: ");
            n = input.nextInt();
            if (n <= 0)
                break;
            System.out.println(n  + (isAsal(n) ? "asal sayıdır." : " asal sayı değildir."));
            i = 2;
        } while (true);
    }
}
