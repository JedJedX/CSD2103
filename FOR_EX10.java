
//เขียนโปรแกรมรับค่า n แล้วคํานวณค่าต่อไปนี้ 1 x 2 x 3 x ... x n
import java.util.Scanner;

public class FOR_EX10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
            if (i == 1) {
                System.out.print(i);
            } else if (i > 1) {
                System.out.print("x" + i);
            }
        }
        System.out.print("=" + sum);

    }
}
