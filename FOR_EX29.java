//เขียนโปรแกรมผลรวม จํานวนที่หารด้วย 3, 5 หรือ 7 ลงตัว ซึ่งอยู่ระหว่าง 1 และ 1000
public class FOR_EX29 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
