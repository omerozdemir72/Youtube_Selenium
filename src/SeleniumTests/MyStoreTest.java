package SeleniumTests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStoreTest {
    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common/home");



driver.findElement(By.xpath("//span[text()='My Account']")).click();


driver.findElement(By.xpath("//a[text()='Register']")).click();




String isim = "Ömer";
WebElement firstName = driver.findElement(By.cssSelector("#input-firstname"));
firstName.sendKeys(isim);


String soyisim = "Özdemir";
WebElement lastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
lastName.sendKeys(soyisim);



String mail = "omer123456@gmail.com";
WebElement email = driver.findElement(By.name("email"));
email.sendKeys(mail);



//(//input[@class='form-control'])[3]
String no = "05351231232";
        WebElement telNo = driver.findElement(By.xpath("//input[@class='form-control' and @id='input-telephone']"));

        telNo.sendKeys(no);



        String pass = "omer123";
        WebElement password = driver.findElement(By.cssSelector("[id=input-password]"));

        password.sendKeys(pass);



        WebElement confirm = driver.findElement(By.name("confirm"));

        confirm.sendKeys(pass);




        WebElement agree = driver.findElement(By.name("agree"));

        agree.click();



        WebElement createAccountButton = driver.findElement(By.cssSelector("input.btn-primary"));
        createAccountButton.click();




        String myMessage = "Your Account Has Been Created!";



Assert.assertEquals(myMessage,driver.getTitle());

        System.out.println("Hesabınız başarıyla oluşturulmuştur...");


    }
}
