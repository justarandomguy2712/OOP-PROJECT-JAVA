/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AGuyJustWantToCode
 */
public class ChiTietDon implements ChiTiet {
    private String ten;
    private double gia;

    public ChiTietDon(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    @Override
   public void showDetails(String indent){
       System.out.println(indent+"- "+ten+" (Gia: "+ gia+")");
   }
    @Override
   public double getCost(){
       return gia;
   }
    
}
