/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lol;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AGuyJustWantToCode
 */
public class MonNhom implements MonAn {
    private String name;
    private List<MonAn> thanhphan= new ArrayList<>();

    public MonNhom(String name) {
        this.name = name;
    }
    public void add(MonAn ma){
        thanhphan.add(ma);
    }
    @Override
    public void display(String indent){
        System.out.println(indent +"- "+name);
        for(MonAn ma: thanhphan){
            ma.display(indent+"  ");
        }
    }
    @Override
    public double getCost(){
        double sum=0;
        for(MonAn ma: thanhphan){
            sum+=ma.getCost();
        }
        return sum;
    }
}
