package TestNG;

import org.testng.annotations.*;

public class MethodlarVeHiyerarsi {


    @BeforeTest
    public void BeforeTest(){

        System.out.println("BEFORE TEST ------ Suite den sonra gelir. Testin başında çalışır.");

    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("BEFORE SUİTE ----- Suite ile başlar, ilk çalışan methoddur.");

    }
    @BeforeClass
    public void BeforeClass(){

        System.out.println("BEFORE CLASS---------------------   \n  Before methoddan önce, before Test ten sonra  çalışan method. ");
    }

    @BeforeMethod
    public void BeforeMethod() {

        System.out.println("BEFORE METHOD---------------------   \nHer Test methodundan önce, BEFORE CLASS'tan sonra çalışır.");

    }
    @Test
    public void Test1(){


        System.out.println("---------Test1---------");
    }
    @Test
    public void Test2(){


        System.out.println("----------Test 2-----------");
    }
    @AfterMethod
    public void AfterMethod(){

        System.out.println("AFTER METHOD ------------------------------------------- \n" +
                "Her test methodundan sonra calısır.");


    }

    @AfterClass
    public void AfterClass(){

        System.out.println("AFTER CLASS -------------------------------------------------- \nClass sonunda çalışır.");
    }

    @AfterSuite
    public void AfterSuite(){

        System.out.println("AFTER SUİTE ----------------- \n Suite tamamlandıktan sonra, yani en son çalışır.");

    }

    @AfterTest
    public void AfterTest(){

        System.out.println("AFTER TEST ----------------- \n Test bittikten sonra çalışır");
    }



}
