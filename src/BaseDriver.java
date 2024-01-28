import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;


    static {
        Logger logger = Logger.getLogger("");
        logger.setLevel(Level.SEVERE); // only show warnings
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // windows screen max width
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://demowebshop.tricentis.com");
    }
    public static void closeDriver(){
        MyFunction.wait(3);
        driver.quit();

    }
}

