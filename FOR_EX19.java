//เขียนโปรแกรมพิมพ์จํานวนที่หารด้วย 3, 5 หรือ 7 ลงตัว ซึ่งอยู่ระหว่าง 1 และ 100
public class FOR_EX19 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                System.out.println(i);
            }
        }
    }

}
