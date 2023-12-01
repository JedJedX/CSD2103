
//เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนจริง และตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่าหรือ เท่ากับ 0 หรือไม่ 
//•ถ้ามีค่าน้อยกว่า 0 ให้พิมพ์ Please insert the number that is greater or equal zero 
//•ถ้ามีค่ามากกว่าหรือเท่ากับ 0 ให้ตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่าหรือเท่ากับ 50 หรือไม่ 
//•ถ้ามีค่ามากกว่าหรือเท่ากับ 50 ให้พิมพ์ Pass 
//•ถ้าน้อยกว่าให้พิมพ์ Fail
import java.util.Scanner;

public class IF_ELSEex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();

        if (num < 0) {
            System.out.println("Please insert the number that is greater or equal to zero");
        } else if (num >= 50) {
            System.out.println("Pass");
        } else if (num < 50) {
            System.out.println("Fail");
        }
    }

}
