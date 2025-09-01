
package Hehe;

public abstract class SinhVien {
    protected String ID;
    protected String name;
    protected double price;
    protected double tax;
    public double getPriceTax(){
       return this.price * this.tax;
    }
    abstract void tinhdiem();
    public SinhVien(String ID, String name, double price, double tax) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.tax = tax;
    }
    public void info(){
        System.out.println("Run Info from parent");
    }
    
}

