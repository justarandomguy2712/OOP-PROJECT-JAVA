/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap;

import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author abcxy
 */
public class Hash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer [] score={9,2,4,5,3,1,8,9,9,7,6,5,7,9,7,3,3,5,8,6,5,4,3,2,5,6,3,7,8,9,3,5,1,2,5,7};
            HashMap<Integer,Integer> mp = new HashMap<>();
            for(int s : score){
                mp.put(s, mp.getOrDefault(s, 0)+1);
            }
           for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
               System.out.println("Diem "+ entry.getKey()+" xuat hien "+entry.getValue()+" lan");
                       
           }
    }
    
}
