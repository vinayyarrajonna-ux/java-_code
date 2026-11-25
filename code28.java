import java.util.HashSet;

public class code28 {
    public static void main(String[] args) {        
        int[] arr = {5, 2, 5, 1, 2, 8};        
        HashSet<Integer> set = new HashSet<>();        
        for (int num : arr) {            
            set.add(num);        
        }        
        System.out.println(set);    
    }
}
