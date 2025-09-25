/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author abcxy
 */
public class MachDon implements MachDien {
    private String name;
    private double R;

    public MachDon(String name, double R) {
        this.name = name;
        this.R = R;
    }
    @Override
    public double TinhDienTro(){
        return R;
    }
    @Override
    public String display(){
        return name + "(" +R+ " V)";
    } 
}
