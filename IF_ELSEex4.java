
//เขียนโปรแกรมรับ input 1 ตัว ที่เป็นสายอักขระ และตรวจสอบว่ามี a, e, i, o, u ในสายอักขระหรือไม่ 
//•ถ้ามีให้พิมพ์ There is vowel 
//•ถ้าไม่มีให้พิมพ์ There is not vowel
import java.util.Scanner;

public class IF_ELSEex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.next();

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o'
                    || text.charAt(i) == 'u') {
                System.out.println("There is  vowel");
            } else {
                System.out.println("There is no vowel");
            }
        }
    }
}
