/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loveyou;

/**
 *
 * @author AGuyJustWantToCode
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
        System.out.println("Ho ten nhan vien la: "+name);
        System.out.println("NAM SINH: "+year);
        System.out.println("DIA CHI: "+address);
        System.out.println("GENDER: "+gender);
        
    }
}
