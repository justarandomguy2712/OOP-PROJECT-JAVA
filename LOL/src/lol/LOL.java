/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lol;

/**
 *
 * @author AGuyJustWantToCode
 */
public class LOL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MonAn xucxich= new MonDon("Xuc xich",10000);
        MonAn MiIndomie= new MonDon("Mi indomie",25000);
        MonAn Banhmi= new MonDon("BanhMi",15000);
        MonNhom DoAnSang= new MonNhom("Menu Do An Sang");
        DoAnSang.add(xucxich);
        DoAnSang.add(MiIndomie);
        MonNhom xk2= new MonNhom("Menu");
        xk2.add(Banhmi);
        xk2.add(DoAnSang);
        xk2.display("");
        System.out.println("Tong gia tri la: "+xk2.getCost());
    }
    
}
