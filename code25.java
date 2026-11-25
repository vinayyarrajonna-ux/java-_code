import java.util.HashMap;
import java.util.Map;

public class code25 {
     public static void main(String[] args) {        
        HashMap<String, Integer> marks = new HashMap<>();        
        marks.put("Aman", 76);        
        marks.put("Riya", 94);        
        marks.put("Karan", 88);        
        String topper = "";        
        int highest = Integer.MIN_VALUE;        
        for (Map.Entry<String, Integer> entry : marks.entrySet()) 
            {            
                if (entry.getValue() > highest) 
                    {                
                        highest = entry.getValue();                
                        topper = entry.getKey();            
                    }        
                }        
                System.out.println(topper + " " + highest);    
            }
}
