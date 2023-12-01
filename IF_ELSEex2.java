
//เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนเต็ม และตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่า 0 หรือไม่ 
//•ถ้ามีค่ามากกว่า 0 ให้พิม์ more than zero 
//•ถ้ามีค่าน้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ less or equal zero
import java.util.Scanner;

public class IF_ELSEex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if (num > 0) {
            System.out.println("more than zero ");
        } else if (num >= 0) {
            System.out.println("less or equal zero");
        } else {
            System.out.println("ERROR");
        }
    }

}
