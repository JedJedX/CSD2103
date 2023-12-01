//เขียนโปรแกรมผลรวม จํานวนที่หารด้วย 3 หรือ 5 ลงตัวเพียงตัวใดตัวหนึ่ง ซึ่งอยู่ระหว่าง 1 และ 1000
public class FOR_EX30 {
    public static void main(String[] args) {
        int sum_3 = 0;
        int sum_5 = 0;
        int total = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 && i % 5 == 1) {
                sum_3 += i;
            } else if (i % 3 == 1 && i % 5 == 0) {
                sum_5 += i;
            }
            total = total + (sum_3 + sum_5);
        }
        System.out.println(total);
    }

}
