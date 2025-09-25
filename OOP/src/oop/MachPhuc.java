/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

import java.util.ArrayList;

/**
 *
 * @author abcxy
 */
public class MachPhuc implements MachDien {
   private ArrayList<MachDien> thanhphan = new ArrayList<>();
   private boolean isNoiTiep;

    public MachPhuc(boolean isNoiTiep) {
        this.isNoiTiep = isNoiTiep;
    }
   public void add(MachDien md){
       thanhphan.add(md);
   }
   @Override
   public double TinhDienTro(){
       if(isNoiTiep){
           double sum=0;
           for(MachDien md: thanhphan){
               sum+=md.TinhDienTro();
           }
           return sum;
       } else {
           double reverse_sum=0;
           for(MachDien md: thanhphan){
              reverse_sum+=1.0/md.TinhDienTro();
           }
           return 1.0/reverse_sum;
       }
   }
   @Override
   public String display(){
           if(isNoiTiep){
               return "Day la mach noi tiep voi so do dien tro la: " + this.TinhDienTro() + " V";
           } else {
                return "Day la mach song song voi so do dien tro la: " + this.TinhDienTro() + " V";
           }
       }
   }

