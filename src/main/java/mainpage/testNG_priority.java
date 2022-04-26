package mainpage;

import org.testng.annotations.Test;

public class testNG_priority {

    // The Below method is executed by alphabetic order like --> a,b,c,d,e
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
    }

    // The Below method is executed by alphabetic order like --> a,b,c,d,e
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
    }


}
