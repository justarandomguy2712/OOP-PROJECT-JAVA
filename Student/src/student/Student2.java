/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author abcxy
 */
public class Student2 extends Person {
    private String ID;
    private String email;
    private double totalscore;

    public Student2(String ID, String email, double totalscore, String name, int year, String address, String gender) {
        super(name, year, address, gender);
        this.ID = ID;
        this.email = email;
        this.totalscore = totalscore;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(double totalscore) {
        this.totalscore = totalscore;
    }
     public String Diemchu(){
    double dtb = totalscore;
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
    @Override
    public void display(){
        super.display();
        System.out.println("Ma sinh vien la: " + ID);
        System.out.println("Email sinh vien la: " + email);
        System.out.println("Diem tong ket cua sinh vien la: " + ID);   
    }
}
