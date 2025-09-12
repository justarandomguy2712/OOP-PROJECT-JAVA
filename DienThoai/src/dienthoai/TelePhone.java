/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dienthoai;

/**
 *
 * @author abcxy
 */
public class TelePhone extends HangHoa {
    private int giasimghep;
    public TelePhone(int giasimghep, String MaHang, String TenHang, int GiaNhap, int GiaBan) {
        super(TenHang, MaHang, GiaNhap, GiaBan);
        this.giasimghep = giasimghep;
    }

    public int getGiasimghep() {
        return giasimghep;
    }

    public void setGiasimghep(int giasimghep) {
        this.giasimghep = giasimghep;
    }
    
    @Override
     public double TinhLoiNhuan(){
        return (GiaBan-GiaNhap)*(1-THUONG_BAN_HANG)-giasimghep;
    }
    @Override
     public void display(){
         super.display();
         System.out.println("Nhap gia sim ghep: "+giasimghep);
     }
}
