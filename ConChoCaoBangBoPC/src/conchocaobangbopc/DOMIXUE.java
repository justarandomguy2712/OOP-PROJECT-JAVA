/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conchocaobangbopc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author AGuyJustWantToCode
 */


class Person {
    private String hoTen;
    private int namSinh;
    private String[] tenMon;
    private double[] diemMon;

    public Person(String hoTen, int namSinh, String[] tenMon, double[] diemMon) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.tenMon = tenMon;
        this.diemMon = diemMon;
    }

    public double tinhDiemTrungBinh() {
        double tong = 0;
        for (double d : diemMon) {
            tong += d;
        }
        return tong / diemMon.length;
    }

    public boolean coMonDuoi5() {
        for (double d : diemMon) {
            if (d < 5) return true;
        }
        return false;
    }

    public List<String> monDuoi5() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < diemMon.length; i++) {
            if (diemMon[i] < 5) {
                list.add(tenMon[i]);
            }
        }
        return list;
    }

    public String xetTotNghiep() {
        double tb = tinhDiemTrungBinh();
        if (!coMonDuoi5() && tb > 7) return "Làm luận văn";
        else if (!coMonDuoi5()) return "Thi tốt nghiệp";
        else return "Thi lại";
    }

    public void hienThi() {
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Năm sinh: " + namSinh);
        System.out.printf("Điểm trung bình: %.2f\n", tinhDiemTrungBinh());
        System.out.println("Kết quả: " + xetTotNghiep());
        if (xetTotNghiep().equals("Thi lại")) {
            System.out.println("Môn thi lại: " + monDuoi5());
        }
        System.out.println("--------------------");
    }

    public String getKetQua() {
        return xetTotNghiep();
    }
}
public class DOMIXUE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n; // Số học viên
        System.out.print("Nhap so hoc vien: ");
        n = Integer.parseInt(sc.nextLine());

        String[] tenMon = new String[9];
        System.out.println("9 mon hoc:");
        for (int i = 0; i < 9; i++) {
            System.out.print("Mon " + (i + 1) + ": ");
            tenMon[i] = sc.nextLine();
        }

        List<Person> danhSach = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("\nNhap ten hoc vien thu " + (i + 1));
            System.out.print("Name: ");
            String hoTen = sc.nextLine();
            System.out.print("Year of Birth: ");
            int namSinh = Integer.parseInt(sc.nextLine());

            double[] diemMon = new double[9];
            for (int j = 0; j < 9; j++) {
                System.out.print("Grade " + tenMon[j] + ": ");
                diemMon[j] = Double.parseDouble(sc.nextLine());
            }

            Person p = new Person(hoTen, namSinh, tenMon, diemMon);
            danhSach.add(p);
        }

       
        System.out.println("\n=== KẾT QUẢ XÉT TỐT NGHIỆP ===");
        for (Person p : danhSach) {
            p.hienThi();
           
}
    }
}
