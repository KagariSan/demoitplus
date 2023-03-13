package exception;

public class NullPointerDemo {
    public static void main(String[] args) {
        equalTest();
        System.out.println("Finish");
    }
    public static void equalTest() {
        try {
            String a = null;
            System.out.println("String equal 'test'" + a.equals("test"));
        } finally {
            System.out.println("Finally");
        }
    }
}
