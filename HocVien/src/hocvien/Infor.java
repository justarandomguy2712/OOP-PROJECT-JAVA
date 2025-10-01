/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hocvien;

/**
 *
 * @author abcxy
 */
public class Infor {
    protected String ID;
    protected String QueQuan;
    protected String Name;
    protected double score;

    public Infor(String ID, String QueQuan, String Name, double score) {
        this.ID = ID;
        this.QueQuan = QueQuan;
        this.Name = Name;
        this.score = score;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getQueQuan() {
        return QueQuan;
    }

    public void setQueQuan(String QueQuan) {
        this.QueQuan = QueQuan;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public String DiemChu(){
        double dtb=score;
     if (dtb >= 9.0) return "A+";
    else if (dtb >= 8.5) return "A";
    else if (dtb >= 7.8) return "B+";
    else if (dtb >= 7.0) return "B";
    else if (dtb >= 6.3) return "C+";
    else if (dtb >= 5.5) return "C";
    else if (dtb >= 4.8) return "D+";
    else if (dtb >= 4.0) return "D";
    else return "F";
    }
}
