package mainpage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsExample {

    // the assesrtion is  the unit testing --> the developer validating the code by himself

    @Test
    public void cheeckEqual(){
        String name = "Paul";
//        if (name.equals(name)){
//            System.out.println("equal");
//        }else{
//            System.out.println("not equal");
//        }
        Assert.assertEquals(name,"Paul");
    }


}
