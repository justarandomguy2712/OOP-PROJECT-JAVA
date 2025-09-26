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
public class ThiSinh {
    protected String name;
    protected int year;
    protected String address;

    public ThiSinh(String name, int year, String address) {
        this.name = name;
        this.year = year;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void nhapthongtin(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhap ten thi sinh: ");
        name=sc.nextLine();
        System.out.println("Nhap ten nam sinh thi sinh: ");
        year=sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap dia chi thi sinh: ");
        address=sc.nextLine();
    }
    public void display(){
        System.out.println("Ho va ten thi sinh la: "+name);
        System.out.println("Nam sinh thi sinh la: "+year);
        System.out.println("Dia chi thi sinh la: "+address);
    }

   
}
