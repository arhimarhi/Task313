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
        int jj = 0;
        for (int i = 0; i < n; ++i) {
            b = false;
            for (int j = i + 1; j < n; ++j) {
                if (a[i] == a[j]) {
                    jj = j;
                    b = true;
                    break;
                }
            }
            if (b) {
                if (jj - i > s) {
                    s = jj - i;
                }
            }
        }
        System.out.println(s);
    }
}
