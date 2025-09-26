/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectuni;

import java.util.Scanner;

/**
 *
 * @author abcxy
 */
public class ThiSinhKhoiA extends ThiSinh {
    private double Toan;
    private double Ly;
    private double Hoa;

    public ThiSinhKhoiA(double Toan, double Ly, double Hoa, String name, int year, String address) {
        super(name, year, address);
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }

    public double getToan() {
        return Toan;
    }

    public void setToan(double Toan) {
        this.Toan = Toan;
    }

    public double getLy() {
        return Ly;
    }

    public void setLy(double Ly) {
        this.Ly = Ly;
    }

    public double getHoa() {
        return Hoa;
    }

    public void setHoa(double Hoa) {
        this.Hoa = Hoa;
    }
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem toan: ");
        Toan=sc.nextDouble();
        System.out.println("Nhap diem Ly: ");
        Ly=sc.nextDouble();
        System.out.println("Nhap diem Hoa: ");
         Hoa=sc.nextDouble();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Diem Toan cua thi sinh la: "+Toan);
        System.out.println("Diem Ly cua thi sinh la: "+Ly);
        System.out.println("Diem Hoa cua thi sinh la: "+Hoa);
    }
    public String TinhDiem(){
        double sum= Toan+Ly+Hoa;
        if(sum>20){
            return "Trúng Tuyển";
        } else{
            return "Trượt";
        }
    }
}
