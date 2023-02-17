package ifelse;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Demo 1");

        int a;
        a = 1;
        int b = 2;
        System.out.println(soSanhAB(a, b));
    }

    /**
     *
     * @since 0.1
     * @param a - Số tự nhiên a cần so sánh
     * @param b - Số tự nhiên b cần so sánh
     * @return String - Chứa chuỗi kết quả là lớn hơn, bé hơn hay bằng
     */
    public static String soSanhAB(int a, int b) {
        boolean aBangB = a == b;
        // So sánh bằng, lớn hơn và bé hơn
        if (aBangB) {
            return "A bang B";
        } else if (a > b) {
            return "A lon hon B";
        } else {
            return "A be hon B";
        }
    }
}
