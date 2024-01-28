import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;


public class Main extends BaseDriver{
    @Test
    public void Us1(){
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
        email.sendKeys("denizan156@gmail.com");
        WebElement password= driver.findElement(By.cssSelector("[id='Password']"));
        password.sendKeys("Deniz3344.");
        WebElement confirmPassword=driver.findElement(By.cssSelector("[id='ConfirmPassword']"));
        confirmPassword.sendKeys("Deniz3344.");
        WebElement registerBtn=driver.findElement(By.cssSelector("[id='register-button']"));
        registerBtn.click();
        WebElement result=driver.findElement(By.cssSelector("[class='result']"));
        Assert.assertTrue("Failed",result.getText().contains("completed"));
    }
    @Test
    public void Us3(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='ico-logout']")));
        WebElement logOut=driver.findElement(By.cssSelector("[class='ico-logout']"));
        logOut.click();
    }
    @Test
    public void Us4(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='ico-login']")));
        WebElement logIn=driver.findElement(By.cssSelector("[class='ico-login']"));
        logIn.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-1 login-button']")));
        WebElement email=driver.findElement(By.cssSelector("[class='email']"));
        email.sendKeys("denizan561@gmail.com");
        WebElement password=driver.findElement(By.cssSelector("[class='password']"));
        password.sendKeys("Deniz3344.");
        driver.findElement(By.cssSelector("[class='button-1 login-button']")).click();

    }
    @Test
    public void Us6(){

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='header-links']>ul>li>[class='account']")));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        WebElement addCard=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[2]/div/div[2]/div[3]/div[2]/input"));
        js.executeScript("arguments[0].scrollIntoView(true);", addCard);
        js.executeScript("arguments[0].click();", addCard);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='add-to-cart-button-2']")));
        WebElement giftName=driver.findElement(By.cssSelector("[id='giftcard_2_RecipientName']"));
        giftName.sendKeys("Mine");
        WebElement giftEmail=driver.findElement(By.cssSelector("[id='giftcard_2_RecipientEmail']"));
        giftEmail.sendKeys("mine3344@gmail.com");
        WebElement addBtn=driver.findElement(By.cssSelector("[id='add-to-cart-button-2']"));
        addBtn.click();
        WebElement content=driver.findElement(By.cssSelector("[class='content']"));
        Assert.assertTrue("Failed",content.getText().contains("added"));
        WebElement shopping=driver.findElement(By.cssSelector("#topcartlink > a > span.cart-label"));
        shopping.click();

        WebElement access=driver.findElement(By.cssSelector("[name='termsofservice']"));
        access.click();
        WebElement checkout=driver.findElement(By.cssSelector("[id='checkout']"));
        checkout.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-1 new-address-next-step-button']")));
        WebElement country=driver.findElement(By.cssSelector("[id='BillingNewAddress_CountryId']"));
        Select countrySelection=new Select(country);
        countrySelection.selectByIndex(1);
        WebElement state=driver.findElement(By.cssSelector("[id='BillingNewAddress_StateProvinceId']"));
        Select stateSelection=new Select(state);
        MyFunction.wait(2);
        stateSelection.selectByIndex(1);
        WebElement city=driver.findElement(By.cssSelector("[id='BillingNewAddress_City']"));
        city.sendKeys("New York");
        WebElement adress=driver.findElement(By.cssSelector("[id='BillingNewAddress_Address1']"));
        adress.sendKeys("New York Code 19");
        WebElement zipCode=driver.findElement(By.cssSelector("[id='BillingNewAddress_ZipPostalCode']"));
        zipCode.sendKeys("3333");
        WebElement phoneNumber=driver.findElement(By.cssSelector("[id='BillingNewAddress_PhoneNumber']"));
        phoneNumber.sendKeys("05301112233");
        driver.findElement(By.cssSelector("[class='button-1 new-address-next-step-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='paymentmethod_3']")));
        WebElement creditSelect=driver.findElement(By.cssSelector("[id='paymentmethod_3']"));
        creditSelect.click();
        driver.findElement(By.cssSelector("[class='button-1 payment-method-next-step-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-1 payment-info-next-step-button']")));
        driver.findElement(By.cssSelector("[id='PurchaseOrderNumber']")).sendKeys("3245");
        driver.findElement(By.cssSelector("[class='button-1 payment-info-next-step-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-1 confirm-order-next-step-button']")));
        driver.findElement(By.cssSelector("[class='button-1 confirm-order-next-step-button']")).click();
        WebElement accces=driver.findElement(By.cssSelector("[class='section order-completed']>div>strong"));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-2 order-completed-continue-button']")));
        Assert.assertTrue("Failed",accces.getText().contains("successfully"));
    }
    @Test
    public void Us7(){
        WebElement main=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[1]/a/img"));
        main.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[id='pollanswers-1']")));
        driver.findElement(By.cssSelector("[id='pollanswers-1']")).click();
        driver.findElement(By.cssSelector("[id='vote-poll-1']")).click();
    }
    @Test
    public void Us8(){

        WebElement main=driver.findElement(By.cssSelector("[class='header-links']>ul>li>[class='account']"));
        main.click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[3]/a")));
        driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div/div[2]/ul/li[3]/a")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-2 order-details-button']")));
        driver.findElement(By.cssSelector("[class='button-2 order-details-button']")).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-2 pdf-order-button']")));
        driver.findElement(By.cssSelector("[class='button-2 pdf-order-button']")).click();
        closeDriver();
    }
}
