

import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author AGuyJustWantToCode
 */
public class ChiTietPhuc implements ChiTiet {
    private String ten;
    private List<ChiTiet> thanhphan= new ArrayList<>();

    public ChiTietPhuc(String ten) {
        this.ten = ten;
    }
    public void add(ChiTiet ct){
        thanhphan.add(ct);
    }
    @Override
    public void showDetails(String indent){
        System.out.println(indent+"- "+ten);
        for(ChiTiet ct: thanhphan){
            ct.showDetails(indent+ "  ");
        }
    }
    @Override
    public double getCost(){
        double tong=0;
        for(ChiTiet ct: thanhphan){
            tong+=ct.getCost();
        }
        return tong;
    }
}
