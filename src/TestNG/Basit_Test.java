package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Random;

public class Basit_Test {



    @BeforeClass
    public void BeforeClass(){


        System.out.println("SİSTEM BAŞLATILIYOR .......................................................................");

    }


    @Test(priority = 2)
    public void Test1(){

        Random random = new Random();

        int a = random.nextInt(10);
        int b = random.nextInt(10);

        int c = a+b;
        System.out.println("c:  " + c );

        Assert.assertTrue(c<12);

    }

    @Test(priority = 3)
    public void Test2(){


        String a = "Techno Study";
        String b= "Techno Study";

        Assert.assertEquals(b,a);

    }
    @AfterClass
    public void AfterClass(){
        System.out.println("SİSTEM KAPATILIYOR ................................");
    }
}
