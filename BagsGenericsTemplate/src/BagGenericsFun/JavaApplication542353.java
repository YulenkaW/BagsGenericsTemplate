
package BagGenericsFun;

import java.util.ArrayList;


public class JavaApplication542353 {

    
    public static void main(String[] args) {
        
              
       GenericTest<String> course = new GenericTest<> ("Cis:", "2353");
       System.out.println (course);
    
            
       ObjectTest otherCourse = new ObjectTest("CIS", 2151) ;
       System.out.println (otherCourse);
        
       NewInterface <String> names = new BagArray<>(10);
       
       names.add("Yuliya");
       names.add("Steven");
       names.add("Stev");
       names.add("Mimmy");
       names.add("Valery");

       Object [] result = names.toArray();
       for (Object name: result){
       System.out.println(name);}
       
       
       System.out.println (names.getFrequencyOf("Yuliya"));
       
       
       BagArray <String> linkedNames = new BagArray<>();
       
       linkedNames.add("Yuliya");
       linkedNames.add("Steven");
       linkedNames.add("Stev");
       linkedNames.add("Mimmy");
       linkedNames.add("Valery");

        result = linkedNames.toArray();
        
       for (Object name: result){
       System.out.println(name);}

       
        
        
        
               } 
    
}
