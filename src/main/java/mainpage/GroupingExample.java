package mainpage;

import org.testng.annotations.Test;

public class GroupingExample {

    // the groups = {"name of the group"} --> this tag is used to group the methods in single file
    @Test(groups = {"Apple"})
    public void Apple1(){
        System.out.println("apple");
    }
    @Test(groups = {"Apple"})
    public void Apple2(){
        System.out.println("apple");
    }
    @Test(groups = {"Blackberry"})
    public void Blackberry1(){
        System.out.println("Black berry");
    }
    @Test(groups = {"Blackberry"})
    public void Blackberry2(){
        System.out.println("Black berry");
    }
    @Test(groups = {"Htc"})
    public void htc1(){
        System.out.println("Htc");
    }
    @Test(groups = {"Htc"})
    public void htc2(){
        System.out.println("Htc");
    }

}
