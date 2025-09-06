/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectb;

/**
 *
 * @author abcxy
 */
public class QuanLy extends CanBo {
    private int HeSoChucVu;
    public QuanLy(int HeSoChucVu, String HoTen, int NamSinh, String GioiTinh, String DiaChi, int HeSoLuong) {
        super(HoTen, NamSinh, GioiTinh, DiaChi, HeSoLuong);
        this.HeSoChucVu = HeSoChucVu;
    }

    public int getHeSoChucVu() {
        return HeSoChucVu;
    }

    public void setHeSoChucVu(int HeSoChucVu) {
        if(HeSoChucVu<=1){
            this.HeSoChucVu=2;
        } else{
            this.HeSoChucVu = HeSoChucVu;
        }
    }
    @Override
    public double TinhLuong(){
        return HeSoLuong*LUONGCOBAN*(1+HeSoChucVu);
    }
    @Override
    public void inthongtin(){
        super.inthongtin();
        System.out.println("GROSS SALARY OF MANAGER IS: "+ TinhLuong());
    }
    
} 
