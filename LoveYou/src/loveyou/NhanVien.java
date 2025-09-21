/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loveyou;

/**
 *
 * @author AGuyJustWantToCode
 */
public class NhanVien extends Person {
    private String ID;
    private int hesoluong;
    private String donvi;

    public NhanVien(String ID, int hesoluong, String donvi, String name, int year, String address, String gender) {
        super(name, year, address, gender);
        this.ID = ID;
        this.hesoluong = hesoluong;
        this.donvi = donvi;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(int hesoluong) {
        this.hesoluong = hesoluong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }
    @Override
    public void display(){
     super.display();
    System.out.println("ID Nhan vien: "+ID);
    System.out.println("He so luong; "+hesoluong);
    System.out.println("Don vi dang cong tac: "+donvi);
            
}
    
    
}
