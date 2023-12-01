//จํานวนที่หารด้วย 3 หรือ 5 ลงตัวที่อยู่ระหว่าง 1 และ 10000 มีกี่จํานวน
public class FOR_EX37 {
    public static void main(String[] args) {
        int loopcount = 0;
        for (int i = 1; i < 10001; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                loopcount++;
            }

        }
        System.out.println(loopcount);
    }
}
