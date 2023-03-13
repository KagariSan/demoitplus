package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroDemo {
    public static void main(String[] args) {
        boolean retry = true;
        while (retry) {
            try {
                devideByInput();
                retry = false;
            } catch (ZeroInputException e) {
                e.getUserInputedNumber();
                System.out.println("Hanh vi khong hop le");
            }
        }

    }

    public static void devideByInput() throws ZeroInputException {
        Scanner scanner = new Scanner(System.in);
        Integer firstNumber = getIntegerFromScanner(scanner);
        Integer secondNumber = getIntegerFromScanner(scanner);
        if (secondNumber == 0) {
            throw new ZeroInputException("Zero Input", secondNumber);
        }
       try {
            Integer ouput = firstNumber/secondNumber;
            System.out.println("Ket qua a/b: " + ouput);
        } catch (ArithmeticException e) {
            System.out.println("Khong the chia cho khong");
        }
    }

    public static Integer getIntegerFromScanner(Scanner scanner) {
        Integer inputNumber = null;
        while (inputNumber == null) {
            try {
                System.out.println("Nhap so dau tien");
                inputNumber = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Vui long nhap so tu nhien");
            } finally {
                scanner.nextLine();
            }
        }
        return inputNumber;
    }
}
