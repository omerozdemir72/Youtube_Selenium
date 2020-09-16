package TestNG;

import org.testng.annotations.Test;

public class enabled_priority {

/*
* priority sayesinde testlerimi istedigim sıraya koyabilirim.
*
*
* Enabled : Hangi test methodunun yanına eklersem, o method görmezden gelinir. Konsolda çıktı olarak bize gösterilmez.
 */
    @Test(priority = 1)
    public void a(){

        System.out.println("a");
    }

    @Test(priority = 2,enabled = false)
    public void b(){

        System.out.println("b");
    }
    @Test(priority = 3)
    public void c(){
        System.out.println("c");
    }
}
