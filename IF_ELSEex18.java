//เขียนโปรแกรมรับ input 3 ตัว ที่เป็นจำนวนเต็ม (Shopping, Hour, Minute) เพื่อคำนวณค่าที่จอดรถ โดยมีเงื่อนไขดังนี้ 
//ถ้า  จะจอดรถฟรี 4 ชั่วโมง หลังจากนั้นจะเสียค่าที่จอดรถชั่ว โมงละ 30 บาท แต่ถ้า  
//จะจอดรถฟรี 1 ชั่วโมง หลังจากนั้นจะเสียค่าจอดชั่วโมง ละ 30 บาท เศษของชั่วโมงนับเป็น 1 ชั่วโมง

import java.util.Scanner;

public class IF_ELSEex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Shopping: ");
        int shop = input.nextInt();
        System.out.print("Hour: ");
        int hour = input.nextInt();
        System.out.print("Minute: ");
        int min = input.nextInt();

        int price = 0;

        if (shop >= 1000) {
            if (hour <= 4) {
                System.out.println("Free");
            } else if (hour > 4) {
                price = (hour - 1) * 30;
                System.out.println(price + " Baht");
            } else if (hour > 4 && min > 0) {
                price = hour * 30;
                System.out.println(price + " Baht");
            }
        } else if (shop < 1000) {
            if (hour <= 1) {
                System.out.println("Free");
            } else if (hour > 1) {
                price = (hour - 1) * 30;
                System.out.println(price + " Baht");
            } else if (hour > 1 && min > 0) {
                price = hour * 30;
                System.out.println(price + " Baht");
            }
        }

    }

}
