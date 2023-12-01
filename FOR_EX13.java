
//เขียนโปรแกรมรับค่า n แล้วคํานวณค่าต่อไปนี้

import java.util.Scanner;

public class FOR_EX13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        double sum = 0;
        double sum_S = 0;
        double total = 0;

        for (double i = 1; i <= n; i++) {
            sum = sum + 1 / (i * i);
            sum_S = sum * 6;
            total = sum_S;
        }
        double squareRoot = Math.sqrt(total);

        System.out.print(sum_S);
        System.out.print(" squareRoot  ");
        System.out.print("estimate = " + squareRoot);

    }
}
