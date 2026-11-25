import java.util.*;
public class code21 {
    public static void main(String[] args) {        
        HashMap<String, Integer> marks = new HashMap<>();        
        marks.put("Aman", 85);        
        marks.put("Riya", 92);        
        marks.put("Karan", 78);        
        for (Map.Entry<String, Integer> entry : marks.entrySet()) {            
            System.out.println(entry.getKey() + " : " + entry.getValue());        
        }    
    }
}
