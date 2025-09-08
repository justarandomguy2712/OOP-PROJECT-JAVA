
package conchocaobangbopc;
import java.util.Scanner;
class cy{
    private double radius;
    private double chieucao;

    public cy(double radius, double chieucao) {
        this.radius = radius;
        this.chieucao = chieucao;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }
     public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bán kính: ");
        radius = sc.nextDouble();
        System.out.print("Nhập chiều cao: ");
        chieucao = sc.nextDouble();
    }

   public double tinhDienTichToanPhan() {
        return 2 * Math.PI * radius * (chieucao + radius);
    }

    
    public double tinhTheTich() {
        return Math.PI * radius * radius * chieucao;
    }

    public void xuat() {
        System.out.println("Bán kính: " + radius);
        System.out.println("Chiều cao: " + chieucao);
        System.out.println("Diện tích toàn phần: " + tinhDienTichToanPhan());
        System.out.println("Thể tích: " + tinhTheTich());
    }
}

public class hinhtru {
     public static void main(String[] args){
         cy sex = new cy(0,0);
         sex.nhap();
         sex.xuat();
     }
}
