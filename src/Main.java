import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean b = false;
        int s = 0;
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) {
            a[i] = scanner.nextInt();
        }
        int mm = 0;
        for (int i = 0; i < n; ++i) {
            b = false;
            for (int m = i + 1; m < n; ++m) {
                if (a[i] == a[m]) {
                    mm = m;
                    b = true;
                    break;
                }
            }
            if (b) {
                if (mm - i > s) {
                    s = mm - i;
                }
            }
        }
        System.out.println(s);
    }
}
