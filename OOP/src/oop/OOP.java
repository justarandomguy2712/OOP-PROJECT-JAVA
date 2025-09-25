/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author abcxy
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner sc= new Scanner (System.in);
       ArrayList<MachDien> ds= new ArrayList<>();
       int n;
       System.out.println("Nhap so luong dien tro: ");
       n=sc.nextInt();
       sc.nextLine();
       
             for (int i = 0; i < n; i++) {
            System.out.print("Nhan ten dien tro thu " + (i + 1) + ": ");
            String ten = sc.nextLine();

            System.out.print("Nhap gia tri dien tro (Ω): ");
            double R = sc.nextDouble();
            sc.nextLine(); 

            MachDon d = new MachDon(ten, R);
            ds.add(d);
        }
             System.out.println("Mach nay la noi tiep hay song song (true/false) ?");
             boolean isNoiTiep= Boolean.parseBoolean(sc.nextLine());
             MachPhuc mp = new MachPhuc(isNoiTiep);
             for(MachDien md: ds){
                 mp.add(md);
             }
             System.out.println(mp.display());
    }
    
}
