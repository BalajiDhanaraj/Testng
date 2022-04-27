package mainpage;

import org.testng.annotations.*;

public class AnnotationExample {

    @Test
    public void test(){
        System.out.println("Test");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BeforeSuite");
    }
    @BeforeTest
    public void Beforetest(){
        System.out.println("Beforetest");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("BeforeMethod");
    }
}
