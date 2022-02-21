/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BagGenericsFun;

/**
 *
 * @author LoginPC
 */
public class ObjectTest {
    private Object first;
    private Object second; 

    public ObjectTest(Object first, Object second) {
        this.first = first;
        this.second = second;
    }
    
    
    @Override
    public String toString (){
        return String.format ("first: %s - second: %s", 
        first.toString(), second.toString()) ;   }
    
}

    
    
    
    
    
