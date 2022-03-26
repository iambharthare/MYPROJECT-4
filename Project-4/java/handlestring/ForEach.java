package in.co.rays.handlestring;

import java.util.ArrayList;
import java.util.List;

public class ForEach { 
    public static void main(String[] args) {  
        List<String> list = new ArrayList<String>();  
        list.add("One");  
        list.add("Two");  
        list.add("Three");  
        list.add("Four");  
      list.forEach(li-> 
       System.out.println(li)); 
       
       
    }
} 
