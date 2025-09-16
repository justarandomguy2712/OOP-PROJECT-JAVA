/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cntt.chan_nuoi_trong_trot;

/**
 *
 * @author abcxy
 */
public class Ruong {
    protected String ID;
    protected String name;
    protected String loaicaytrong;
    protected final int DIEN_TICH_MAX=100;
    protected int chieudai,chieurong;
    public Ruong(String ID, String name, String loaicaytrong) {
        this.ID = ID;
        this.name = name;
        this.loaicaytrong = loaicaytrong;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoaicaytrong() {
        return loaicaytrong;
    }

    public void setLoaicaytrong(String loaicaytrong) {
        this.loaicaytrong = loaicaytrong;
    }
    public double tinhDienTich(){
        return chieudai*chieurong;
    }
    public void display(){
        System.out.println("Ma ruong: "+ID);
        System.out.println("Ten chu ho: "+ID);
        System.out.println("Loai cay trong: "+ID);
    }
}
