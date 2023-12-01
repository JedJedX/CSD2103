
//เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนจริง และตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่าหรือ เท่ากับ 0 หรือไม่ 
//•ถ้ามีค่าน้อยกว่า 0 ให้พิมพ์ Please insert the num that is greater or equal zero 
//•ถ้ามีค่ามากกว่าหรือเท่ากับ 0 ให้ตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่าหรือเท่ากับ 80 หรือไม่ ถ้า มีค่ามากกว่าหรือเท่ากับ 80 ให้พิมพ์ A 
//แต่ถ้ามีค่าน้อยกว่า 80 ให้ตรวจสอบว่า จำนวนที่รับมามีค่า มากกว่าหรือเท่ากับ 70 หรือไม่ ถ้ามีค่ามากกว่าหรือเท่ากับ 70 ให้พิมพ์ B 
//แต่ถ้ามีค่าน้อยกว่า 70 ให้ตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่าหรือเท่ากับ 60 หรือไม่ ถ้ามีค่ามากกว่าหรือเท่ากับ 60 ให้พิมพ์ C 
//แต่ถ้ามีค่าน้อยกว่า 60 ให้ตรวจสอบว่า จำนวนที่รับมามีค่ามากกว่าหรือเท่ากับ 50 หรือไม่ ถ้ามีค่ามากกว่าให้พิมพ์ D ถ้ามีค่าน้อยกว่าให้พิมพ์ F
import java.util.Scanner;

public class IF_ELSEex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num = input.nextFloat();

        if (num < 0) {
            System.out.println("Please insert the number that is greater than zero");
        } else if (num >= 80) {
            System.out.println("A");
        } else if (num >= 70) {
            System.out.println("B");
        } else if (num >= 60) {
            System.out.println("C");
        } else if (num >= 50) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

}
