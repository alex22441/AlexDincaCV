import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputForm extends AbstractMain{

    @Test
    public void singleInputField() {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        getElementCss("#get-input > div:nth-child(1) > input:nth-child(2)").sendKeys("test1");
        getElementCss("button.btn:nth-child(2)").click();
        String display0=getElementCss("#display").getText();
        Assertions.assertEquals("test1",display0);
    }
    @Test
    public void twoInputField() {
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
        getElementCss("#sum1").sendKeys("1");
        getElementCss("#sum2").sendKeys("2");
        getElementCss("button.btn:nth-child(3)").click();
        String display1= getElementCss("#displayvalue").getText();
        System.out.println(display1);
    }
    @Test
    public void checkmultiple() {
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        getElementCss("#isAgeSelected").click();

        String variabila=("Success - Check box is checked");
        String textvariabila= getElementCss("#txtAge").getText();

        Assertions.assertEquals(variabila,textvariabila);
    }

    @Test
    public void multipleCheckboxDemo() {
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
        getElementCss("div.checkbox:nth-child(3) > label:nth-child(1) > input:nth-child(1)").click();
        getElementCss("div.checkbox:nth-child(4) > label:nth-child(1) > input:nth-child(1)").click();
        getElementCss("div.checkbox:nth-child(5) > label:nth-child(1) > input:nth-child(1)").click();
        getElementCss("div.checkbox:nth-child(6) > label:nth-child(1) > input:nth-child(1)").click();

        String asrt1= getElementCss("#check1").getAttribute("value");
        String asrt2 = ("Uncheck All");
        sleep();
        Assertions.assertEquals(asrt1, asrt2);
    }
}
