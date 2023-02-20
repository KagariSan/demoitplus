package de1;

public class Question {

    static class Student {
        Student(String name, int mark) {
            this.name = name;
            this.mark = mark;
        }
        String name;
        int mark;
    }

    public static void main(String[] args) {
        Student a = new Student("Nguyen Van A", 10);
        Student b = new Student("Nguyen Van B", 5);
        Student c = new Student("Nguyen Van C", 8);

        Student[] students = {a, b, c};
        // A
        System.out.println(students[0].name + "-" + students[0].mark);
        System.out.println(students.length);

        // Tim va in ten nguoi co diem so cao nhat
        int viTriCuaHSDiemSoCAoNhat = 0;
        for (int i = 1; i < students.length; i++) {
            int diemSoCaoNhatHIenTai = students[viTriCuaHSDiemSoCAoNhat].mark;

            int diemSoHocSinhHienTai = students[i].mark;

            if (diemSoCaoNhatHIenTai < diemSoHocSinhHienTai) {
                viTriCuaHSDiemSoCAoNhat = i;
            }
        }
        System.out.println("Hoc Sinh Co Diem Cao Nhat: " + students[viTriCuaHSDiemSoCAoNhat].name);

        // In ra ten cua nguoi co diem so thap nhat

        // In ra lan luot ten va diem so + xep hang cuar tung HS
        // 0-6 tb, 6-8 kha, 8-10 gioi
        for (Student hs: students) {
            System.out.println("Ten: " + hs.name);
            System.out.println("Diem so: " + hs.mark);

            if (hs.mark > 8) {
                System.out.println("Xep hang Gioi");
            } else if (hs.mark > 6) {
                System.out.println("Xep hang Kha");
            } else {
                System.out.println("Xep hang TB");
            }
        }
    }
}
