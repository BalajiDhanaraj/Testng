package mainpage;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExample {

    // the parameterization is the data given in runtime of the testcase
    @Test
    @Parameters({"Name", "Age"})
    public void printName(String name,String age){
        System.out.println("Name "+name+" "+age);
    }

}
