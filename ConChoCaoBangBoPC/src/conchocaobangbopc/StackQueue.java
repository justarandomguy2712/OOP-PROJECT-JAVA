
package conchocaobangbopc;
import java.util.Stack;
class STACK{
    
}
public class StackQueue {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        System.out.println("EMPTY? " +stack.isEmpty());
        stack.push(10);
        stack.push(20);
        stack.push(30);
         System.out.println("Stack sau khi push: " + stack);
         System.out.println("PEAK OF STACK "+stack.peek());
         int x=stack.pop();
         System.out.println("Pop: "+x);
         System.out.println("Stack sau khi rong: "+stack);
          System.out.println("EMPTY? " +stack.isEmpty());
    }
}
