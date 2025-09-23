/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dembele2025;

/**
 *
 * @author AGuyJustWantToCode
 */
public class SinhVienCoKhi extends SinhVien {
    private String chuyennganhCoKhi;

    public SinhVienCoKhi(String chuyenNganhCoKhi, String name, int year, String quequan) {
        super(name, year, quequan);
        this.chuyennganhCoKhi= chuyenNganhCoKhi;
    }

    public String getChuyenNganhCoKhi() {
        return chuyennganhCoKhi;
    }

    public void setChuyenNganhCoKhi(String chuyenNganhCoKhi) {
        this.chuyennganhCoKhi = chuyenNganhCoKhi;
    }
    
}
