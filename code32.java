import java.util.Arrays;
import java.util.LinkedList;

public class code32 {
    public static void main(String[] args) {        
        LinkedList<Integer> list =  new LinkedList<>(Arrays.asList(20, 30, 40));        
        list.addFirst(10);        
        list.addLast(50);        
        System.out.println(list);    
    }
}
