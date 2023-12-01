
//เขียนโปรแกรมรับ input 1 ตัว เป็นจำนวนเงินในหน่วยบาท (จำนวนเต็ม) และตรวจสอบว่า จำนวนที่รับ มามีค่ามากกว่า 0 หรือไม่ 
//•ถ้ามีค่ามากกว่า 0 ให้คำนวณจำนวนเงินในหน่วยดอลล่าที่สามารถแลกได้ และ กำไรที่ธนาคารได้ 
//โดยที่ธนาคารขายเงินดอลล่าที่ราคา 32.80 บาท (ซึ่งธนาคารจะได้กำไร 0.30 บาท)
//พิมพ์จำนวนเงิน ดอลล่าที่แลกได้ และ กำไรของธนาคาร 
//•ถ้ามีค่าน้อยกว่าหรือเท่ากับ 0 ให้พิมพ์ You don’t have “money !”
import java.util.Scanner;

public class IF_ELSEex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double baht = input.nextDouble();

        double profit = 0;

        if (baht > 0) {
            baht /= 32.8;
            profit = baht * 0.3;
            System.out.println("THB to USD: " + baht + "\nBank profit: " + profit);
        } else {
            System.out.println("You don't have \"money!\"");
        }
    }

}
