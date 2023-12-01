
//เขียนโปรแกรมพิมพ์ -9, 8, -7, 6, -5, 4, -3, 2, -1, 0
public class FOR_EX8 {
    public static void main(String[] args) {
        for (int i = 9; i >= 0; i--) {
            if (i % 2 == 1) {
                System.out.println(-i);
            } else {
                System.out.println(i);
            }
        }
    }

}
