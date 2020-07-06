import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public abstract class AbstractMain {
    WebDriver driver;

    private WebDriver starter() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Alex\\Desktop\\seleniumtraining\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;

    }

    @BeforeEach
    public void before() {
        driver = starter();
    }

    public WebElement getElementCss(String valoare) {
        return driver.findElement(By.cssSelector(valoare));
    }

    public WebElement getElementName(String name) {
        return driver.findElement(By.name(name));
    }

    public WebElement getElementXpath(String valoarexpath) { return driver.findElement(By.xpath(valoarexpath)); }

    public void clickText(String text) {
        WebElement object = driver.findElement(By.linkText(text));
        object.click();
    }

    public void sleep() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ie) {
        }
    }

    public static void takeSnapShot(WebDriver webdriver, String fileWithPath) throws Exception {
        TakesScreenshot scrShot = ((TakesScreenshot) webdriver);
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile = new File(fileWithPath);
        FileUtils.copyFile(SrcFile, DestFile);

    }
}

