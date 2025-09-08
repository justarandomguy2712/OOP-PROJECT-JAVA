
package conchocaobangbopc;
import java.util.Scanner;
class CCCD1{
    private String name;
    private long soCCCD;

    public CCCD1(String name, long soCCCD) {
        this.name = name;
        this.soCCCD = soCCCD;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        name = sc.nextLine();
        System.out.println("Nhap CCCD: ");
        soCCCD= Long.parseLong(sc.nextLine());
    }
    public void xuat(){
        System.out.println("Ho va ten: "+name);
        System.out.println("So CCCD la: 00"+soCCCD);
    }
}
public class CCCD {
    public static void main(String[] args){
        String name = null;
        long soCCCD = 0;
       CCCD1 ds = new CCCD1(name,soCCCD);
       ds.nhap();
       ds.xuat();
    }
            
}
