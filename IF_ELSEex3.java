
//เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนเต็ม และตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่า 0, น้อย กว่า 0 หรือ เท่ากับ 0 
//•ถ้ามีค่ามากกว่า 0 ให้พิมพ์ > 0 
//•ถ้ามีค่าน้อยกว่า 0 ให้พิมพ์ < 0 
//•ถ้ามีค่าเท่ากับ 0 ให้พิมพ์ = 0
import java.util.Scanner;

public class IF_ELSEex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("> 0");
        } else if (num < 0) {
            System.out.println("< 0");
        } else if (num == 0) {
            System.out.println("= 0");
        } else {
            System.out.println("ERROR");
        }

    }
}
