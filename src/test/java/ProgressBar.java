import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class ProgressBar extends AbstractMain {

    @Test
    public void jqueryDownloadProgressbars() throws Exception{
        driver.get("https://www.seleniumeasy.com/test/jquery-download-progress-bar-demo.html");
        getElementCss("#downloadButton").click();
        Thread.sleep(4000);
        String s1 = getElementCss(".progress-label").getText();
        String s11 = getElementCss("#ui-id-1").getText();
        System.out.println(s1+" "+s11);
        getElementCss(".ui-dialog-buttonset > button:nth-child(1)").click();
        getElementCss("#downloadButton").click();
        Thread.sleep(10000);
        String s2 = getElementCss(".progress-label").getText();
        String s22 = getElementCss("#ui-id-1").getText();
        System.out.println(s2+" "+s22);


    }

    @Test
    public void bootstrapProgressbar() {
        driver.get("https://www.seleniumeasy.com/test/bootstrap-download-progress-demo.html");
        getElementCss("#cricle-btn").click();
        sleep();
        String s1=getElementCss(".percenttext").getText();
        System.out.println(s1);

    }

    @Test
    public void dragDropSliders() {
        driver.get("https://www.seleniumeasy.com/test/drag-drop-range-sliders-demo.html");
        WebElement From=driver.findElement(By.cssSelector("#slider1 > div:nth-child(2) > input:nth-child(1)"));
        WebElement To=driver.findElement(By.cssSelector("#slider1 > div:nth-child(2) > input:nth-child(1)"));
        Actions act=new Actions(driver);
        act.dragAndDrop(From, To).build().perform();
        String v1 = getElementCss("#range").getText();
        String s1 = ("10");
        Assert.assertNotEquals(v1,s1);
    }

}

