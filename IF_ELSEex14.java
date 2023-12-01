//เขียนโปรแกรมรับ input 2 ตัว ที่เป็นจำนวนเต็ม และตรวจสอบว่า ผลบวกของจำนวนทั้ง 2 มีค่ามากกว่า 0, น้อยกว่า 0 หรือ เท่ากับ 0 
//•ถ้ามีค่ามากกว่า 0 ให้พิมพ์ a + b > 0 
//•ถ้ามีค่าน้อยกว่า 0 ให้พิมพ์ a + b < 0 
//•ถ้ามีค่าเท่ากับ 0 ให้พิมพ์ a + b = 0

import java.util.Scanner;

public class IF_ELSEex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();

        if (a + b > 0) {
            System.out.println("a + b > 0");
        } else if (a + b < 0) {
            System.out.println("a + b < 0");
        } else {
            System.out.println("a + b = 0");
        }
    }

}
