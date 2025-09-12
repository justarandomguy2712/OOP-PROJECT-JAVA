/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dienthoai;

/**
 *
 * @author abcxy
 */
public class HangHoa {
    protected String TenHang;
    protected String MaHang;
    protected int GiaNhap;
    protected int GiaBan;
    protected final double THUONG_BAN_HANG=0.2;

    public HangHoa(String MaHang, String TenHang, int GiaNhap, int GiaBan) {
        this.TenHang = TenHang;
        this.MaHang = MaHang;
        this.GiaNhap = GiaNhap;
        this.GiaBan = GiaBan;
    }

    public String getTenHang() {
        return TenHang;
    }

    public void setTenHang(String TenHang) {
        this.TenHang = TenHang;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public int getGiaNhap() {
        return GiaNhap;
    }

    public void setGiaNhap(int GiaNhap) {
        this.GiaNhap = GiaNhap;
    }

    public int getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(int GiaBan) {
        this.GiaBan = GiaBan;
    }
    public double TinhLoiNhuan(){
        return (GiaBan-GiaNhap)*(1-THUONG_BAN_HANG);
    }
    public void display(){
        System.out.println("Ma Hang la: "+ MaHang);
        System.out.println("Ten Hang la: "+TenHang);
        System.out.println("Gia Nhap la: "+GiaNhap);
        System.out.println("Gia Ban la: "+GiaBan);
        System.out.println("Loi Nhuan la: "+TinhLoiNhuan());
    }
}
