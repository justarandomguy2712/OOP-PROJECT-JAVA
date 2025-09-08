
package conchocaobangbopc;

import java.util.Scanner;
public class point {
    private int x;
    private int y;
    private int z;

    public point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public point(){}
        public void Negate(){
            this.x = -this.x;
            this.y = -this.y;
            this.z = -this.z;
        }
        public double Norm() {
        return Math.sqrt(x * x + y * y + z * z);
    }
         public void Print() {
        System.out.println("(" + x + ", " + y + ", " + z + ")");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
         public static void main(String[] args){
             int x,y,z;
             Scanner sc= new Scanner(System.in);
             System.out.println("Nhap x:");
             x=sc.nextInt();
             System.out.println("Nhap y:");
             y=sc.nextInt();
             System.out.println("Nhap z:");
             z=sc.nextInt();
        point ps = new point(x,y,z);
        ps.Print(); 

        System.out.println("Distance: " + ps.Norm()); 

        ps.Negate();
        ps.Print(); 
         }
    }


