//เขียนโปรแกรมรับค่า n แล้วคํานวณค่าต่อไปนี้ 1 + 2 + 3 +...+ n

import java.util.Scanner;

public class FOR_EX9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            if (i == 1) {
                System.out.print(i);
            } else if (i > 1) {
                System.out.print("+" + i);
            }
        }
        System.out.print("=" + sum);

    }
}
