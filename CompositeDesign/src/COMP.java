/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AGuyJustWantToCode
 */
public class COMP {
    public static void main(String[] args){
        ChiTiet ocVit= new ChiTietDon("Oc vit 23",999);
        ChiTiet DongcoV5= new ChiTietDon("DongcoV5",1999);
        ChiTiet banhrang= new ChiTietDon("banhrang12",99);
        ChiTietPhuc move= new ChiTietPhuc("Chuyen dong");
        move.add(ocVit);
        move.add(DongcoV5);
        ChiTietPhuc xk2= new ChiTietPhuc("ALL");
        xk2.add(banhrang);
        xk2.add(move);
        xk2.showDetails("");
        System.out.println("In ra tong gia tri: "+xk2.getCost());
    }
}
