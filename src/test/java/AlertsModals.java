import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AlertsModals extends AbstractMain{

    @Test
    public void bootstrapAlertMessages() {
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        getElementCss("#autoclosable-btn-success").click();

        Boolean Display = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]")).isDisplayed();
        System.out.println(Display);
        sleep();
        sleep();
        sleep();
        Boolean Display1 = driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div[1]")).isDisplayed();
        System.out.println(Display1);


    }
    @Test
    public void message2(){
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        getElementCss("#normal-btn-success").click();
        String btn1 = getElementCss("div.alert:nth-child(2)").getText();
        System.out.println("text is displayed "+btn1);
        getElementCss("div.alert:nth-child(2) > button:nth-child(1)").click();
        Boolean display11 = driver.findElement(By.cssSelector("div.alert:nth-child(2)")).isDisplayed();
        System.out.println("text is displayed "+display11);
    }

    @Test
    public void autoclose(){
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        getElementCss("#autoclosable-btn-warning").click();
        Boolean displaytrue = driver.findElement(By.cssSelector("div.alert:nth-child(3)")).isDisplayed();
        System.out.println("text is displayed "+displaytrue);
        sleep();
        sleep();
        Boolean displayfalse = driver.findElement(By.cssSelector("div.alert:nth-child(3)")).isDisplayed();
        System.out.println("text is displayed "+displayfalse);

    }
    @Test
    public void warningButton4(){
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        getElementCss("#normal-btn-warning").click();
        String dis = getElementCss("div.alert:nth-child(4)").getText();
        System.out.println(dis);
        getElementCss("div.alert:nth-child(4) > button:nth-child(1)").click();
        Boolean displayfalse = driver.findElement(By.cssSelector("div.alert:nth-child(4)")).isDisplayed();
        System.out.println("text is displayed "+displayfalse);

    }
    @Test
    public void autocloseDanger5(){
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        getElementCss("#autoclosable-btn-danger").click();
        sleep();
        Boolean displayTrue = driver.findElement(By.cssSelector("div.alert:nth-child(5)")).isDisplayed();
        System.out.println(displayTrue);
        sleep();
        sleep();
        Boolean displayFalse = driver.findElement(By.cssSelector("div.alert:nth-child(5)")).isDisplayed();
        System.out.println("text is displayed "+displayFalse);

    }
    @Test
    public void normalDanger6(){
        driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        getElementCss("#normal-btn-danger").click();
        String displayTrue = getElementCss("div.alert:nth-child(6)").getText();
        System.out.println(displayTrue);
        getElementCss("div.alert:nth-child(6) > button:nth-child(1)").click();
        Boolean displayFalse = driver.findElement(By.cssSelector("div.alert:nth-child(6)")).isDisplayed();
        System.out.println("text is displayed "+displayFalse);
    }
 //   @Test
//     public void autoCloseInfo7(){
//         driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
//         getElementCss("#autoclosable-btn-info").click();

    //     }
//     @Test
//     public void normalInfoMessage8(){
//         driver.get("https://www.seleniumeasy.com/test/bootstrap-alert-messages-demo.html");
        //        getElementCss("#normal-btn-info").click();


//     }
}

