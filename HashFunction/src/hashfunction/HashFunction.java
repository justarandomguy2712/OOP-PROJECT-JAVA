/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashfunction;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author abcxy
 */
public class HashFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] name={"KHMT-VNU-UET","IT-E7-HUST","IT1-HUST","EE2-HUST","ET1-HUST"};
        Integer[] count={5,9,4,10,7};
        HashMap<String,Integer> mp= new HashMap<>();
        //for(String s: name){
            //mp.put(s,mp.getOrDefault(s, 0)+1);
        //}
        for(int i=0;i<name.length;i++){
            mp.put(name[i], count[i]);
        }
        for(Map.Entry <String,Integer> entry: mp.entrySet()){
            System.out.println("Nganh va truong ma hoc sinh lop 12A1 dang ki: "+entry.getKey()+" co so hoc sinh trung tuyen la: "+entry.getValue());
        }
    }
    
}
