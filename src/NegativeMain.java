import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NegativeMain extends BaseDriver{
    @Test
    public void Us2(){
        WebElement register=driver.findElement(By.cssSelector("[class='ico-register']"));
        register.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='register-button']")));
        WebElement gender=driver.findElement(By.cssSelector("[id='gender-male']"));
        gender.click();
        WebElement name=driver.findElement(By.cssSelector("[id='FirstName']"));
        name.sendKeys("Deniz");
        WebElement surName=driver.findElement(By.cssSelector("[id='LastName']"));
        surName.sendKeys("Aydın");
        WebElement email=driver.findElement(By.cssSelector("[id='Email']"));
        email.sendKeys("aydın3344@gmail.com");
        WebElement password= driver.findElement(By.cssSelector("[id='Password']"));
        password.sendKeys("Deniz3344.");
        WebElement confirmPassword=driver.findElement(By.cssSelector("[id='ConfirmPassword']"));
        confirmPassword.sendKeys("Deniz3344.");
        MyFunction.wait(2);
        WebElement registerBtn=driver.findElement(By.cssSelector("[id='register-button']"));
        registerBtn.click();
        WebElement resultFailed=driver.findElement(By.cssSelector("[class='validation-summary-errors']>ul>li"));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("[class='validation-summary-errors']>ul>li"),"The specified email already exists"));
        Assert.assertTrue("Failed",resultFailed.getText().contains("already exists"));
    }
    @Test
    public void Us5(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='ico-login']")));
        WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
        logIn.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-1 login-button']")));
        WebElement loginBtn=driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loginBtn.click();
        WebElement warning=driver.findElement(By.cssSelector("[class='validation-summary-errors']>span"));
        Assert.assertTrue("Failed",warning.getText().contains("unsuccessful"));


    }

}
