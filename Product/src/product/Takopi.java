
package product;

public class Takopi extends car {
   private String modelname= "Mustang";
   public static void main (String[] args){
       Takopi mycar = new Takopi();
       mycar.honk();
       System.out.println(mycar.brand + " " + mycar.modelname);
   }
}
