//เขียนโปรแกรมรับ input 1 ตัว เป็นอุณหภูมิในหน่วยฟาเรนไฮต์ (จำนวนจริง) และตรวจสอบว่า จำนวนที่ รับมามีค่ามากหรือเท่ากับ 32 หรือไม่ 
//•ถ้ามีค่ามากกว่าหรือเท่ากับ 32 ให้คำนวนอุณหภูมิในหน่วยองศาเซลเซียส () และพิมพ์ค่าออกมา 
//•ถ้ามีค่าน้อยกว่า 32 ให้พิมพ์ Too cold to live

import java.util.Scanner;

public class IF_ELSEex9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temperature = input.nextFloat();

        if (temperature >= 32) {
            System.out.println((5 * (temperature - 32)) / 9);
        } else if (temperature < 32) {
            System.out.println("Too cold to live");
        }
    }

}
