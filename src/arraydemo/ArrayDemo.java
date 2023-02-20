package arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int nhietDo7NgayTiep[] = new int[7];
        nhietDo7NgayTiep[0] = 24;
        nhietDo7NgayTiep[1] = 24;
        nhietDo7NgayTiep[2] = 24;
        nhietDo7NgayTiep[3] = 24;
        nhietDo7NgayTiep[4] = 24;
        nhietDo7NgayTiep[5] = 24;
        nhietDo7NgayTiep[6] = 24;

        int nhietDo3NgayTiep[] = new int[3];
        System.arraycopy(nhietDo7NgayTiep, 0, nhietDo3NgayTiep, 0, 3);

//        System.in.
        Scanner scanner = new Scanner(System.in);
//        int nextInt = scanner.nextInt();
//        System.out.println("So nhap vao la: " + nextInt);

        // Khai bao Array bang du lieu duoc nhap vao tu scanner
        // Nhap vao kich thuoc cua array
        System.out.println("Nhap vao kich thuoc cua array: ");
        int arrayLength = scanner.nextInt();
        scanner.nextLine();
        int array[]  = new int[arrayLength];
        // Nhap vao gia tri tung phan tu trong array
        System.out.println("Nhap vao cac phan tu cua array, cach nhau boi dau cach:");
        for (int i = 0; i < arrayLength; i++) {
            array[i] = scanner.nextInt();
        }
        // In ra array da duoc nhap vao
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Phan tu o vi tri " + i + " la: " + array[i]);
        }

    }
}
