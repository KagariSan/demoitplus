package menu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String start = "1. Tim kiem \n" +
                "2. Xoa \n" +
                "3. Thoat \n" +
                "Chon: ";
        Scanner scanner = new Scanner(System.in);
        Integer input = 0;
        while ( input != 3) {
            System.out.println(start);
            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                search(scanner);
            } else
            if (input == 2) {
                System.out.println("Ban xoa gi?");
            } else {
                System.out.println("Vui long chon 1-3");
            }
        }
        System.out.println("Good bye!");
    }

    public static void search(Scanner scanner) {
        String start = "1. Tim lai 10k \n" +
                "2. Tim gi khong biet \n" +
                "3. Thoat \n" +
                "Chon: ";
        Integer input = 0;
        while ( input != 3) {
            System.out.println(start);
            input = scanner.nextInt();
            scanner.nextLine();

            if (input == 1) {
                System.out.println("10k khong tim duoc?");
            } else
            if (input == 2) {
                System.out.println("Ko hoi lam gi?");
            } else {
                System.out.println("Vui long chon 1-3");
            }
        }
    }
}
