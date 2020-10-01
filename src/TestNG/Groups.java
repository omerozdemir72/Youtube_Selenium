package TestNG;

import org.junit.After;
import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.*;

public class Groups {



    @BeforeMethod
    public void beforeMethod(){


        System.out.println("  Before method ------------ ------------- ");
    }


    @Test
    public void test1(){


        System.out.println("Test -- 1");

    }

    @BeforeClass
    public void beforeClass(){

        System.out.println("Sistem Açılıyor...............");

    }

    @AfterMethod
    public void AfterMethod(){


        System.out.println("After method --------- ------------- ");
    }
    @Test
    public void test2(){


        System.out.println("Test -- 2");

    }
    @AfterClass
    public void AfterClass(){

        System.out.println("Sistem kapanıyor...........");
    }

    @Test
    public void test3(){


        System.out.println("Test -- 3");

    }


}
