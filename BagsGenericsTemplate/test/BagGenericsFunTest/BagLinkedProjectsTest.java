
package BagGenericsFunTest;

import BagGenericsFun.BagArray;
import org.junit.Test;
import static org.junit.Assert.*;


public class BagLinkedProjectsTest {
    
    public BagLinkedProjectsTest() {
    }
    
    
    
    @Test
    public void testGetCurrentSize() {
        //Arrange
        BagArray<String> bag = new BagArray<>();
        bag.add ("Test");
        int expectedCurrentSize = 1;
        //Act
        int actualCurrentSize = bag.getCurrentSize();
        
        //Assert
        assertEquals (expectedCurrentSize, actualCurrentSize);
    }

    @Test
    public void testIsEmpty() {
        //Arrange
        BagArray<String> bag = new BagArray<>();
        bag.add ("Test");
        
        //Act
        boolean actualIsEmpty = bag.isEmpty();
        
        //Assert
        assertFalse(actualIsEmpty);    }

        
        
    

    @Test
    public void testAdd() {

        BagArray<String> bag = new BagArray<>();
        String expectedValue = "test";
        int expectedCurrentSize =1;
        //Act
        boolean addResult = bag.add ("Test");
        int actualCurrentSize = bag.getCurrentSize();
        Object [] result = bag.toArray();
         
        //Assert
        assertTrue(addResult);
        assertEquals (expectedCurrentSize, actualCurrentSize);
        assertEquals (expectedValue, result[0]);     
    }

    @Test
    public void testRemove_0args() {
        fail();
    }

    @Test
    public void testRemove_GenericType() {
        fail();
    }

    @Test
    public void testClear() {
        fail();
    }

    @Test
    public void testGetFrequencyOf() {
        fail();
    }

    @Test
    public void testContains() {
        fail();
    }

    @Test
    public void testToArray() {
        fail();
    }
    
}

