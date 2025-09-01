
package Hehe;
import java.util.ArrayList;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        ArrayList<Double> list= new ArrayList<>();
        while(true){
            System.out.println("Nhap so");
            double x = scanner.nextDouble();
            list.add(x);
            System.out.println("Nhap them Y/N? :");
            scanner.nextLine();
            String tieptuc = scanner.nextLine();
            if(tieptuc.equalsIgnoreCase("N")){
                 break;
        }           
   }
       for(int i=0;i<list.size();i++){
           System.out.println(list.get(i));
 }
       double sum=0;
     for(int i=0;i<list.size();i++){
         sum+=list.get(i);
   }
     System.out.printf("%.2f",sum);
 }
}
