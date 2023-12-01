
//.เขียนโปรแกรมรับ input 1 ตัว ที่เป็นจำนวนเต็มบวก และตรวจสอบว่าเป็นเลขคู่หรือเลขคี่ 
//•ถ้าเป็นเลขคู่ให้พิมพ์ even 
//•ถ้าเป็นเลขคี่ให้พิมพ์ odd
import java.util.Scanner;

public class IF_ELSEex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else if (num % 2 == 1) {
            System.out.println("odd");
        } else {
            System.out.println("ERROR");
        }

    }

}
