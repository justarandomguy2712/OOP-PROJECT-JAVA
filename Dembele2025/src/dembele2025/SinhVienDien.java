/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dembele2025;

/**
 *
 * @author AGuyJustWantToCode
 */
public class SinhVienDien extends SinhVien {
    private String chuyenNganh;

    public SinhVienDien(String chuyenNganh, String name, int year, String quequan) {
        super(name, year, quequan);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
}
