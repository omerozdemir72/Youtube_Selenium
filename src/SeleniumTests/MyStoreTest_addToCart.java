package SeleniumTests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStoreTest_addToCart {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common/home");



        WebElement textArea= driver.findElement(By.cssSelector("input[name='search']"));

        textArea.sendKeys("Iphone");
        textArea.sendKeys(Keys.ENTER);



        WebElement list = driver.findElement(By.cssSelector("#list-view"));

        list.click();



        WebElement addToCartButton = driver.findElement(By.cssSelector("button[onclick*='cart']"));

        addToCartButton.click();

        Thread.sleep(1000);


        WebElement alert = driver.findElement(By.cssSelector(".alert-success"));

        System.out.println(alert.getText());


        String myAlert = "Success: You have added iPhone to your shopping cart!\n" +
                "×";

        // 1. Yol

        Assert.assertEquals(myAlert,alert.getText());
        System.out.println("Test 1 geçmiştir");
        //2. yol
        Assert.assertTrue(alert.getText().contains("Success: You have added iPhone"));
        System.out.println("Test 2 geçmiştir");




        WebElement cartButton = driver.findElement(By.cssSelector("#cart-total"));

        cartButton.click();

        WebElement totalPrice = driver.findElement(By.cssSelector(".table.table-bordered>tbody>:last-of-type>:last-of-type"));

        System.out.println(totalPrice.getText());


        String myTotal = "$123.20";

        Assert.assertEquals(myTotal,totalPrice.getText());

        System.out.println("Fiyat karta yansımıştır..");

Thread.sleep(3000);


WebElement removeButton= driver.findElement(By.xpath("//button[@title='Remove']"));

removeButton.click();


Thread.sleep(2000);

WebElement cartbutton2 = driver.findElement(By.cssSelector("div#cart>button"));

cartbutton2.click();



WebElement removeMessage= driver.findElement(By.cssSelector("p.text-center"));

     //   System.out.println(removeMessage.getText());



        Assert.assertTrue(removeMessage.getText().contains("empty"));
        System.out.println("Kartınız  boş");
    }
}
