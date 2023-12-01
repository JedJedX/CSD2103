//เขียนโปรแกรมพิมพ์จํานวนที่หารด้วย 3 และ 5 ลงตัว แต่หารด้วย 2 ไม่ลงตัว ซึ่งอยู่ระหว่าง 1 และ 100
public class FOR_EX22 {
    public static void main(String[] args) {
        for (int i = 1; i < 101; i++) {
            if (((i % 3 == 0) && (i % 5 == 0)) && (i % 2 == 1)) {
                System.out.println(i);
            }

        }
    }
}
