package hello;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class SimpleTest {  
    @BeforeClass  
    public void setUp() {  
        System.out.println("setUp");  
    }  
  
    @Test(groups = { "slow" })  
    public void failTest() {  
        System.out.println("slow test");  
    }  
  
    @Test(groups = { "fast" })  
    public void aFastTest() {  
        System.out.println("fast test");  
    }  
}  