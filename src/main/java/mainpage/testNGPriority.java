package mainpage;

import org.testng.annotations.Test;

public class testNGPriority {

/*    // The Below method is executed by alphabetic order like --> a,b,c,d,e
    @Test
    public void startTheCar(){
        System.out.println("car is started");
    }
    @Test
    public void putSecondGear(){
        System.out.println("Second Gear");
    }
    @Test
    public void putThirdGear(){
        System.out.println("Third Gear");
    }
    @Test
    public void putFourGear(){
        System.out.println("Four Gear");
    }*/

    // The Below method is executed based on the priority by numeric values 1,2,3

    @Test(priority = 0)  // the 0 value is base so the order the execution started from 0,1,2
    public void startTheCar(){
        System.out.println("car is started");
    }
    @Test(priority = -1) // the -1, -2 is the negative value , so the order of the execution will at backward like -2,-1,0,1,2,3
    public void putSecondGear(){
        System.out.println("Second Gear");
    }
    @Test(priority = 1)
    public void putThirdGear(){
        System.out.println("Third Gear");
    }
    @Test(priority = 4)
    public void putFourGear(){
        System.out.println("Four Gear");
    }


}
