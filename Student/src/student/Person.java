/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author abcxy
 */
public class Person {
    protected String name;
    protected int year;
    protected String address;
    protected String gender;

    public Person(String name, int year, String address, String gender) {
        this.name = name;
        this.year = year;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
    public void display(){
        System.out.println("Ho va ten sinh vien: "+name);
        System.out.println("Ngay sinh cua sinh vien: "+year);
        System.out.println("Gioi tinh: "+gender);
        System.out.println("Dia chi cua sinh vien: "+name);
    }
}
