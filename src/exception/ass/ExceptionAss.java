package exception.ass;

import java.util.Scanner;

public class ExceptionAss {
    // Viết một hàm nhận đầu vào từ scanner và trả ra String/Integer/Double
    // Nếu string dài hơn 10 ký tự thì bắn ra 1 ngoại lệ dạng Check
    // Nếu nhập vào (integer/double) không phải số thì phải bắt người dùng nhập lại

    public static String getString(Scanner scanner) {
        return null;
    }
    public static Integer getInteger(Scanner scanner) {
        return null;
    }
    public static Double getDouble(Scanner scanner) {
        return null;
    }

    public static void main(String[] args) {
        try {
            getString(new Scanner("123123123123123123"));
        } catch (Exception ex) {
            System.out.println("Cau 1 dung");
        }
    }
}
