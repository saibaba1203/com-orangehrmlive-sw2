package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com//";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userSholdLoginSuccessfullyWithValidCredentials(){
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
        driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
        String expectedMessage = "Welcome Anderson";
        WebElement message = driver.findElement(By.xpath("//a[@id='welcome']"));
        String actualMessage = message.getText();
        Assert.assertEquals("welcome text is not displayed",expectedMessage , actualMessage);

    }


}
