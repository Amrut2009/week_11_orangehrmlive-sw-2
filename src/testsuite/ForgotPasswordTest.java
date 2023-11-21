package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

@Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){
         driver.findElement(By.xpath("//p[text() = 'Forgot your password? ']")).click();
String expectedMessage="Reset Password";
String actualMessage= driver.findElement(By.xpath("//h6[text() = 'Reset Password']")).getText();
    Assert.assertEquals(expectedMessage,actualMessage);
    }
    @After
    public void testDown(){
        closeBrowser();
    }
}
