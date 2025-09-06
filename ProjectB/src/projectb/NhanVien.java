
package projectb;

public class NhanVien extends CanBo {
    private String NganhDaoTao;

    public NhanVien(String NganhDaoTao, String HoTen, int NamSinh, String GioiTinh, String DiaChi, int HeSoLuong) {
        super(HoTen, NamSinh, GioiTinh, DiaChi, HeSoLuong);
        this.NganhDaoTao = NganhDaoTao;
    }

    public String getNganhDaoTao() {
        return NganhDaoTao;
    }
    public void setNganhDaoTao(String NganhDaoTao) {
        this.NganhDaoTao = NganhDaoTao;
    }
    @Override
    public double TinhLuong(){
        return HeSoLuong*LUONGCOBAN;
    }
    @Override
     public void inthongtin(){
        super.inthongtin();
        System.out.println("GROSS SALARY IS: "+ TinhLuong());
    }
}
