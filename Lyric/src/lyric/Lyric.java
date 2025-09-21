/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lyric;

/**
 *
 * @author AGuyJustWantToCode
 */
public class Lyric {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        String lyric="We don't talk anymore\n"
                + "We don't talk anymore\n"
                + "We don't talk anymore\n"
                + "Like we used to do\n"
                + "We don't love anymore\n"
                + "What was all of it for?\n"
                + "Oh, we don't talk anymore\n"
                + "Like we used to do\n"
                + "I just heard you found the one you've been looking\n"
                + "You've been looking for\n"
                ;
       printSlowly(lyric,50,260);
    }
 public static void printSlowly(String text,int linedelay,int chardelay) throws InterruptedException{
           String[] lines = text.split("\n");
           for(String line: lines){
               for(char c: line.toCharArray()){
                   System.out.print(c);
                   System.out.flush();
                   Thread.sleep(chardelay);
               }
               System.out.println();
               Thread.sleep(linedelay);
           }
       }
    
    
}
