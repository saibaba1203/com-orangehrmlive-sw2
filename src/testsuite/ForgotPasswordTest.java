package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com//";

    @Before

    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test

    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
        driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
        String expectedMessage = "Forgot Your Password?";
        WebElement message = driver.findElement(By.xpath("//h1[contains(text(),'Forgot Your Password?')]"));
        String actualMessage = message.getText();
        Assert.assertEquals("Forgot password is not displayed",expectedMessage , actualMessage);

    }
}
