package lanqiao;
import java.util.Scanner;

public class BadTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();  // rows
        int m = input.nextInt();  // columns
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum += input.nextInt();
            }
        }
        System.out.println(sum);
    }
}

