
package Hehe;
import java.util.ArrayList;
public class Student {
    public String name;
    public int ID;
    public Student(String name, int ID){
        this.name=name;
        this.ID=ID;
    }
    public static void main (String[] args){
        ArrayList<Student> list= new ArrayList<>();
    list.add(new Student("Nguyen Van A", 202421));
    list.add(new Student("Hoang Manh Tien", 202412));
    list.add(new Student("Hoang Thuy Linh", 202411));
    list.add(new Student("Nguyen Manh Ha", 202112));
    list.add(new Student("Nguyen Hoang Anh", 202012));
        for(Student st: list){
            String st1= st.name.substring(0,6);
            if(st1.equalsIgnoreCase("Nguyen")){
                System.out.println(st.name+ "-" + st.ID);
            }
        }
   }
    
}


