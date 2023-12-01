
//เขียนโปรแกรมรับ input 1 ตัว เป็นปีคริสตศักราช (จำนวนเต็ม) และตรวจสอบว่า จำนวนที่รับมามีค่า มากกว่าหรือเท่ากับ 0 หรือไม่ 
//•ถ้ามีค่ามากกว่าหรือเท่ากับ 0 ให้คำนวณปีพุทธศักราช (ปีคริสตศักราช + 543) และพิมพ์ค่าออกมา 
//•ถ้ามีค่าน้อยกว่า 0 ให้พิมพ์ Please insert number that is greater or equal zero
import java.util.Scanner;

public class IF_ELSEex8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int BEC = input.nextInt();

        if (BEC >= 0) {
            System.out.println(BEC += 543);
        } else if (BEC < 0) {
            System.out.println("Please insert number that is greater or equal to zero");
        }
    }

}
