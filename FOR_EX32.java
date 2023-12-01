//เขียนโปรแกรมผลรวม จํานวนที่หารด้วย 3 และ 5 ลงตัว แต่หารด้วย 2 ไม่ลงตัว ซึ่งอยู่ระหว่าง 1 และ1000
public class FOR_EX32 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 1001; i++) {
            if (((i % 3 == 0) && (i % 5 == 0)) && (i % 2 == 1)) {
                sum += i;
            }

        }
        System.out.println(sum);
    }
}
