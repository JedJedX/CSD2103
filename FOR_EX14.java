//เขียนโปรแกรมพิมพ์จํานวนที่หารด้วย 3 ลงตัว ซึ่งอยู่ระหว่าง 1 และ 100
public class FOR_EX14 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}
