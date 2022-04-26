package mainpage;

import org.testng.annotations.Test;

public class SkipATestCase {
       // The Below method is executed by alphabetic order like --> a,b,c,d,e
    @Test(priority = 0)
    public void startTheCar(){
        System.out.println("car is started");
    }
    /// the default value of execution is set up as Boolean = True, so we want to skip
    // execution we can override by give False on it.
    @Test(priority = 4, enabled = false)
    public void musicOn(){
        System.out.println("Music is on");
    }
    @Test(priority = 1)
    public void putSecondGear(){
        System.out.println("Second Gear");
    }
    @Test(priority = 2)
    public void putThirdGear(){
        System.out.println("Third Gear");
    }
    @Test(priority = 3)
    public void putFourGear(){
        System.out.println("Four Gear");
    }
}
