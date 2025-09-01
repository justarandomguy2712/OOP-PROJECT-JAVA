
package Hehe;
import java.util.regex.*;
import java.util.Scanner;
public class Regular {
    public static boolean checkCCCD(String cccd){
        String regex= "^\\d{12}$";
        return Pattern.matches(regex,cccd);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("Nhap so CCCD: ");
        String CCCD= scanner.nextLine();
          if(checkCCCD(CCCD)){
              System.out.println("TRUE");
       } else {
              System.out.println("False");
          }
       
    }
    
}
