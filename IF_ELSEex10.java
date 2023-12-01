//เขียนโปรแกรมรับ input 1 ตัว เป็นจำนวนเงินในหน่วยดอลล่าสหรัฐ (จำนวนจริง) และตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่า 0 หรือไม่ 
//•ถ้ามีค่ามากกว่า 0 ให้คำนวณจำนวนในหน่วยบาท () และพิมพ์ค่าออกมา 
//•ถ้ามีค่าน้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ You don’t have money

import java.util.Scanner;

public class IF_ELSEex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float USD = input.nextFloat();

        if (USD > 0) {
            System.out.println(USD * 32.5);
        } else if (USD <= 0) {
            System.out.println("You don't have money");
        }
    }
}
