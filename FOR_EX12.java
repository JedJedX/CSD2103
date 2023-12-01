// เขียนโปรแกรมรับค่า n แล้วคํานวณค่าต่อไปนี้
// 1/1^2+1/2^2+1/3^2+...+1/n^2

import java.util.Scanner;

public class FOR_EX12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum = sum + 1 / (i * i);
            if (i == 1) {
                System.out.print(1 / (i * i));
            } else if (i > 1) {
                System.out.print("+" + 1 / (i * i));
            }
        }
        System.out.print("=" + sum);

    }
}