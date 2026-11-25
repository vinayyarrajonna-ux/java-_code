import java.util.*;
public class code22 {
     public static void main(String[] args) {        
        HashMap<String, Integer> prices = new HashMap<>();        
        prices.put("Pen", 10);        
        prices.put("Book", 50);        
        prices.put("Bag", 700);        
        String product = "Book";        
        if (prices.containsKey(product)) {            
            System.out.println("Available");        
        } 
        else {            
            System.out.println("Not available");        
        }    
    }
}
