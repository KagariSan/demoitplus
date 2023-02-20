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
        int nextInt = scanner.nextInt();
        System.out.println("So nhap vao la: " + nextInt);

        // Khai bao Array bang du lieu duoc nhap vao tu scanner
        // Nhap vao kich thuoc cua array
        // Nhap vao gia tri tung phan tu trong array
        // In ra array da duoc nhap vao
    }
}
