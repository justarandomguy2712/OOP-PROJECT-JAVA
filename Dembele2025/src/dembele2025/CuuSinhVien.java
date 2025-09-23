/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dembele2025;

/**
 *
 * @author AGuyJustWantToCode
 */
public class CuuSinhVien extends SinhVien {
    private int namtotnghiep;
    private String congty;

    public CuuSinhVien(int namtotnghiep, String congty, String name, int year, String quequan) {
        super(name, year, quequan);
        this.namtotnghiep = namtotnghiep;
        this.congty = congty;
    }

    public int getNamtotnghiep() {
        return namtotnghiep;
    }

    public void setNamtotnghiep(int namtotnghiep) {
        this.namtotnghiep = namtotnghiep;
    }

    public String getCongty() {
        return congty;
    }

    public void setCongty(String congty) {
        this.congty = congty;
    }
    
}
