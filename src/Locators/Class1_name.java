package Locators;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1_name {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "C:/Users/omero/Selenium/ChromeDriver/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common/home");



        WebElement myAccountButton = driver.findElement(By.xpath("//span[text()='My Account']"));

        myAccountButton.click();


        WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));

        register.click();



        WebElement inputFirstName = driver.findElement(By.cssSelector("#input-firstname"));

        inputFirstName.sendKeys("Ömer");



        WebElement inputLastName = driver.findElement(By.id("input-lastname"));

        inputLastName.sendKeys("Özdemir");



        WebElement inputEmail= driver.findElement(By.xpath("//input[@placeholder='E-Mail']"));

        inputEmail.sendKeys("omerozdemir@gmail.com");



        WebElement inputNumber = driver.findElement(By.name("telephone"));

        inputNumber.sendKeys("05354443322");


        WebElement password = driver.findElement(By.cssSelector("#input-password"));

        password.sendKeys("omeroz123");



        WebElement passConfirm = driver.findElement(By.cssSelector("#input-confirm"));


        passConfirm.sendKeys("omeroz123");



        WebElement checkButton  = driver.findElement(By.xpath("//input[@name='agree']"));

        checkButton.click();



        WebElement  accept = driver.findElement(By.xpath("//input[@value='Continue']"));

        accept.click();

        String title = driver.getTitle();



        String myMessage ="Your Account Has Been Created!";



        Assert.assertEquals("Register sayfasında bir hatanız mevcuttur.",myMessage,title);
        System.out.println(myMessage);

    }
}
