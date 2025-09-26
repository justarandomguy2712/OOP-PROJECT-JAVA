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
public class ThiSinhKhoiC extends ThiSinh {
    private double Van;
    private double Dia;
    private double Su;

    public ThiSinhKhoiC(double Van, double Dia, double Su, String name, int year, String address) {
        super(name, year, address);
        this.Van = Van;
        this.Dia = Dia;
        this.Su = Su;
    }

    public double getVan() {
        return Van;
    }

    public void setVan(double Van) {
        this.Van = Van;
    }

    public double getDia() {
        return Dia;
    }

    public void setDia(double Dia) {
        this.Dia = Dia;
    }

    public double getSu() {
        return Su;
    }

    public void setSu(double Su) {
        this.Su = Su;
    }
    @Override
    public void nhapthongtin(){
        super.nhapthongtin();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap diem Van: ");
        Van=sc.nextDouble();
        System.out.println("Nhap diem Su: ");
        Su=sc.nextDouble();
        System.out.println("Nhap diem Dia: ");
        Dia=sc.nextDouble();
    }
    @Override
    public void display(){
        super.display();
        System.out.println("Diem Van cua thi sinh la: "+Van);
        System.out.println("Diem Su cua thi sinh la: "+Su);
        System.out.println("Diem Dia cua thi sinh la: "+Dia);
    }
     public String TinhDiem2(){
        double sum= Van +Su+Dia;
        if(sum>20){
            return "Trúng Tuyển";
        } else{
            return "Trượt";
        }
    }
}
