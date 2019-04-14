import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong(), M = sc.nextLong(), A = sc.nextLong();
        long a1 = 0;
        if (N % A == 0)
            a1 = N / A;
        else
            a1 = N / A + 1;
        long a2 = 0;
        if (M % A == 0)
            a2 = M / A;
        else
            a2 = M / A + 1;
        System.out.print(a1 * a2 + "\n");
    }
}
