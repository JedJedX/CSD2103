//เขียนโปรแกรมพิมพ์จํานวนที่หารด้วย (3 และ 5 ลงตัว), (3 และ 7 ลงตัว) หรือ (5 และ 7 ลงตัว) ซึ่งอยู่ระหว่าง 1 และ 1000
public class FOR_EX21 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(" , ");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(" , ");
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print("  ");
    }
}
