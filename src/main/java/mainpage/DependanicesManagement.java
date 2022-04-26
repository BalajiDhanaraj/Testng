package mainpage;

import org.testng.annotations.Test;

public class DependanicesManagement {

    /*
    * This is dependency injection
    * Scenario --> the base function is to the started the browser, but if the browser isnt started this not use of testing the website
    * the browser should be open, and then website will be testable
    * dependency injection enable the function
    *  */
    @Test(enabled = true)
    public void highSchool(){
        System.out.println("High school");
    }
    @Test(dependsOnMethods = "highSchool")
    public void higherSecondary(){
        System.out.println("Higher Secondary");
    }
    @Test(dependsOnMethods = "higherSecondary")
    public void engineering(){
        System.out.println("Engineering");
    }
}
