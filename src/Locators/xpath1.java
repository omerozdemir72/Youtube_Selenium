package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

    public static void main(String[] args) throws InterruptedException {

//// TODO: 6.07.2020                        XPATH

        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.de/ref=nav_logo");
        driver.manage().window().maximize();


        /*

                  Xpath, daha spesifik olup dinamik ögeleri rahatlıkla bulmamızı sağlar.
                    Basic xpath = //tagname[@attribute=’value’] ---             //etiketadı[@nitelik = 'değer']

                   1.Absolute Xpath
            /html[1]/body[1]/div[1]/div[2]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]

                   2.Relative Xpath
                   //input[@name='q']
*/
        /*
                   3.Contains (ait olmak)

                 Dinamik değişikliklerin olabileceği durumlarda:

                 Xpath //*[contains(@type,'sub')] ----                      //etiketadi(contains(@nitelik,'değer')]         * işareti tüm html kodlarını kapsar.(Tümü)


                 4.Starts-with()

            Aramalarımızda uzun kodları daha kolay bulmamızı sağlar.


                 5.OR, AND

                 OR için iki kısımdan bir tanesinin doğru olması yeterli.
                 AND için iki tarafın da doğru olması gerekiyor.

         */

driver.findElement(By.xpath("//span[text()='und Bestellungen']")).click();






    }
}
