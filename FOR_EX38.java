//จํานวนที่หารด้วย 3, 5 และ 7 ลงตัว ซึ่งอยู่ระหว่าง 1 และ 10000 มีกี่จํานวน
public class FOR_EX38 {
    public static void main(String[] args) {
        int loopcount = 0;
        for (int i = 1; i < 10001; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                loopcount++;
            }

        }
        System.out.println(loopcount);
    }
}
