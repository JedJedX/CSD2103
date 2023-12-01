
//เขียนโปรแกรมพิมพ์จํานวนที่หารด้วย 3 หรือ 5 ลงตัวเพียงตัวใดตัวหนึ่ง ซึ่งอยู่ระหว่าง 1 และ 100

public class FOR_EX20 {
    public static void main(String[] args) {

        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 5 == 1) {
                System.out.println(i);
            } else if (i % 3 == 1 && i % 5 == 0) {
                System.out.println(i);
            }
        }

    }
}
