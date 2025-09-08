
package conchocaobangbopc;
import java.util.Scanner;
public class ConChoCaoBangBoPC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int a,b,i,min;
       System.out.println("Nhap 2 so a va b");
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b){
            min =b;
        } else {
            min=a;
        }
        for(i=2;i<min;i++){
            if((a%i==0)&&(b%i==0)){
                break;
            }
            if(i==min){
                System.out.println("Ko co mau chung nho nhat");
            }
        }
        System.out.println("Mau so chung nho nhat la: " + i);
    }
    
}
