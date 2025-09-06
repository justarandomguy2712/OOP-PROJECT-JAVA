/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectb;

/**
 *
 * @author abcxy
 */
public class CanBo {
    protected String HoTen;
    protected int NamSinh;
    protected String GioiTinh;
    protected String DiaChi;
    protected int HeSoLuong;
    protected final double LUONGCOBAN=2000000;

    public CanBo(String HoTen, int NamSinh, String GioiTinh, String DiaChi, int HeSoLuong) {
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.GioiTinh = GioiTinh;
        this.DiaChi = DiaChi;
        this.HeSoLuong = HeSoLuong;
    }
    public String getHoTen() {
        return HoTen;
    }
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public int getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(int NamSinh) {
        this.NamSinh = NamSinh;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public int getHeSoLuong() {
        return HeSoLuong;
    }

    public void setHeSoLuong(int HeSoLuong) {
        this.HeSoLuong = HeSoLuong;
    }
    public double TinhLuong(){
        return HeSoLuong*LUONGCOBAN;
    }
    public void inthongtin(){
        System.out.println("Ho va ten la: " +HoTen);
        System.out.println("Nam sinh: " +NamSinh);
        System.out.println("Gioi tinh: "+GioiTinh);
        System.out.println("Dia chi: "+DiaChi);
        System.out.println("He So Luong Bong: "+HeSoLuong);
        System.out.println("GROSS SALARY: "+TinhLuong());
    }
}
