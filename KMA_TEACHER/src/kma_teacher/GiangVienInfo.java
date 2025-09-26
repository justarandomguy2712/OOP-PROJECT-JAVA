/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kma_teacher;

/**
 *
 * @author abcxy
 */
public class GiangVienInfo {
    private String name;
    private String ID;
    private String address;
    private String gender;
    private Khoa khoa;

    public GiangVienInfo(String name, String ID, String address, String gender, Khoa khoa) {
        this.name = name;
        this.ID = ID;
        this.address = address;
        this.gender = gender;
        this.khoa = khoa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Khoa getKhoa() {
        return khoa;
    }

    public void setKhoa(Khoa khoa) {
        this.khoa = khoa;
    }
    
}
