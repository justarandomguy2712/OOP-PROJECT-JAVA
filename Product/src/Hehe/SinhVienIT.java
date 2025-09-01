
package Hehe;
public class SinhVienIT extends SinhVien {
    private String language;
    public void getMoney(){
        System.out.println("run get money");
        this.info();
      
    }
    public SinhVienIT(String language,String ID, String name, double price, double tax){
        super(ID,name,price,tax);
         this.language=language;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    
    public void info(){
        System.out.println("Run from sinh vien IT");
    }

    @Override
    void tinhdiem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
   
}
