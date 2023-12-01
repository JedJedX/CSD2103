
//เขียนโปรแกรมรับ input 2 ตัว ที่เป็นจำนวนเต็ม และตรวจสอบว่า ผลบวกของจำนวนทั้ง 2 มีค่ามากกว่า 0, น้อยกว่า 0 หรือ เท่ากับ 0 
//•ถ้ามีค่ามากกว่า 0 ให้ตรวจสอบว่า เป็นเลขคู่หรือไม่ 
//•ถ้าเป็นเลขคู่ให้พิมพ์ Positive Even 
//•ถ้าเป็นเลขคี่ให้พิมพ์ Positive Odd 
//•ถ้ามีค่าน้อยกว่า 0 ให้ตรวจสอบว่า เป็นเลขคู่หรือไม่ 
//•ถ้าเป็นเลขคู่ให้พิมพ์ Negative Even 
//•ถ้าเป็นเลขคี่ให้พิมพ์ Negative Odd 
//•ถ้ามีค่าเท่ากับ 0 ให้พิมพ์ Zero
import java.util.Scanner;

public class IF_ELSEex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int num1 = input.nextInt();
        System.out.print("b: ");
        int num2 = input.nextInt();

        if ((num1 + num2) == 0) {
            System.out.println("Zero");
        } else if ((num1 + num2) > 0) {
            if ((num1 + num2) % 2 == 0) {
                System.out.println("Positive Even");
            } else {
                System.out.println("Positive Odd");
            }
        } else if ((num1 + num2) < 0) {
            if ((num1 + num2) % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
            }
        }
    }

}
