
//เขียนโปรแกรมรับ input 1 ตัว ที่เป็นอักขระ (A, B, C, D, F) และตรวจสอบอักขระ 
//•ถ้าเป็น A ให้พิมพ์ [80, 100] 
//•ถ้าเป็น B ให้พิมพ์ [70, 80) 
//•ถ้าเป็น C ให้พิมพ์ [60, 70) 
//•ถ้าเป็น D ให้พิมพ์ [50, 60) 
//•ถ้าเป็น F ให้พิมพ์ [0, 50)
import java.util.Scanner;

public class IF_ELSEex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char grade = input.next().toUpperCase().charAt(0);

        if (grade == 'A') {
            System.out.println("[80, 100]");
        } else if (grade == 'B') {
            System.out.println("[70, 80]");
        } else if (grade == 'C') {
            System.out.println("[60, 70]");
        } else if (grade == 'D') {
            System.out.println("[50, 60]");
        } else if (grade == 'F') {
            System.out.println("[0, 50]");
        } else {
            System.out.println("ERROR");
        }

    }

}
