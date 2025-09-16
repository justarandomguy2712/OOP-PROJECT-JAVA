/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cntt.chan_nuoi_trong_trot;

/**
 *
 * @author abcxy
 */
public class RuongChuNhat extends Ruong {
    private double chieudai;
    private double chieurong;
    public RuongChuNhat(double chieudai, double chieurong, String ID, String name, String loaicaytrong) {
        super(ID, name, loaicaytrong);
        this.chieudai = chieudai;
        this.chieurong = chieurong;
       
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    @Override
    public double tinhDienTich() {
        return chieudai * chieurong;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Dien tich ruong la: " + tinhDienTich());
    }
}
