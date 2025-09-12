/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dienthoai;

/**
 *
 * @author abcxy
 */
public class Tablet extends HangHoa {
    private int kichthuoc;
    private boolean isTablet;

    public Tablet(int kichthuoc, boolean isTablet, String MaHang, String TenHang, int GiaNhap, int GiaBan) {
        super(TenHang, MaHang, GiaNhap, GiaBan);
        this.kichthuoc = kichthuoc;
        this.isTablet = isTablet;
    }
   

    public int getKichthuoc() {
        return kichthuoc;
    }

    public void setKichthuoc(int kichthuoc) {
        this.kichthuoc = kichthuoc;
    }
    @Override
     public double TinhLoiNhuan(){
        return (GiaBan-GiaNhap)*(1-THUONG_BAN_HANG);
    }
    @Override
     public void display(){
         super.display();
         System.out.println("Kich Thuoc man la: "+kichthuoc);
     }
}
