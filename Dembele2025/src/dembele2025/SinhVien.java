/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dembele2025;

/**
 *
 * @author AGuyJustWantToCode
 */
public class SinhVien {
    protected String name;
    protected int year;
    protected String quequan;

    public SinhVien(String name, int year, String quequan) {
        this.name = name;
        this.year = year;
        this.quequan = quequan;
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

    public String getQuequan() {
        return quequan;
    }

    public void setQuequan(String quequan) {
        this.quequan = quequan;
    }
    
}
