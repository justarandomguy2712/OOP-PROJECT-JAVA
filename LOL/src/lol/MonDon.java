/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lol;

/**
 *
 * @author AGuyJustWantToCode
 */
public class MonDon implements MonAn {
    private String name;
    private int gia;

    public MonDon(String name, int gia) {
        this.name = name;
        this.gia = gia;
    }

   
    @Override
    public void display(String indent){
        System.out.println(indent+"- "+name+" (Gia: "+ gia+" VND)");
    }
    @Override
    public double getCost(){
        return gia;
    }
}
