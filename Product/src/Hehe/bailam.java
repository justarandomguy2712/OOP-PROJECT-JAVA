
package Hehe;
import java.util.Scanner;
public class bailam {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten dang nhap");
        String username= scanner.nextLine();
        System.out.println("Nhap mat khau");
        String password = scanner.nextLine();
        Integer x=username.length();
        Integer y=password.length();
         if(x.equals(6) && y.equals(6)){
             System.out.println("Right");
         } else {
             System.out.println("False");
         }
      }
    }

