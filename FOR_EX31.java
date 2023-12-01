//เขียนโปรแกรมผลรวม จํานวนที่หารด้วย (3 และ 5 ลงตัว), (3 และ 7 ลงตัว) หรือ (5 และ 7 ลงตัว) ซึ่งอยู่ระหว่าง 1 และ 10000
public class FOR_EX31 {
    public static void main(String[] args) {
        int sum_1 = 0;
        int sum_2 = 0;
        int sum_3 = 0;
        for (int i = 1; i < 1001; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                sum_1 += i;
            }
        }
        System.out.print(sum_1 + " , ");
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                sum_2 += i;
                ;
            }
        }
        System.out.print(sum_2 + " , ");
        for (int i = 1; i < 101; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                sum_3 += i;
                ;
            }
        }
        System.out.print(sum_3 + "  ");
    }
}
