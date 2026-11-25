import java.util.Arrays;
import java.util.LinkedList;

public class code33 {
     public static void main(String[] args) {        
        LinkedList<Integer> list =  new LinkedList<>(Arrays.asList(10, 20, 30, 40, 50));        
        list.removeFirst();        
        list.removeLast();        
        System.out.println(list);    
    }
}
