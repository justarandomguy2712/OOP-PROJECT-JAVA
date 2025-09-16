/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cntt.chan_nuoi_trong_trot;

/**
 *
 * @author abcxy
 */
public class RuongVuong extends Ruong {
   
   private double dodaicanh;
   public static int countVuong=0;

    public RuongVuong(double dodaicanh, String ID, String name, String loaicaytrong) {
        super(ID, name, loaicaytrong);
        this.dodaicanh = dodaicanh;
    }
    
    @Override

    public double tinhDienTich() {
        return dodaicanh * dodaicanh;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Dien tich manh dat vuong la: " + tinhDienTich());
    }
}
