
package Hehe;
public class SinhVienTuDongHoa extends SinhVien {
    private String skill;
    public SinhVienTuDongHoa(String skill, String ID, String name, double price, double tax) {
        super(ID, name, price, tax);
        this.skill = skill;

     }

    @Override
    void tinhdiem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
