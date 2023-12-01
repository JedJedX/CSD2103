//เขียนโปรแกรมรับ input 2 ตัว ที่เป็นจำนวนเต็ม (Hour, Minute) เพื่อคำนวณค่าที่จอดรถ โดยชั่วโมง แรกจอดฟรี 
//หลังจากนั้นเสียค่าจอดชั่วโมงละ 30 บาท เศษของชั่วโมงนับเป็น 1 ชั่วโมง ถ้าผู้ใช้ โปรแกรมป้อน input ตัวใดตัวหนึ่ง 
//หรือ ทั้งสองตัวเป็นจำนวนเต็มลบ ให้พิพพ์ It can’t be negative และไม่ต้องคำนวณค่าที่จอดรถ

import java.util.Scanner;

public class IF_ELSEex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hour: ");
        int hour = input.nextInt();
        System.out.print("Minute: ");
        int min = input.nextInt();

        int price = 0;

        if (hour < 0 || min < 0) {
            System.out.println("It can't be negative");
        } else if (hour <= 1) {
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
