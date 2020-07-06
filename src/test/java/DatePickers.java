import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DatePickers extends AbstractMain{
    @Test
    public void BootstrapDatePicker() {
        driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");
        getElementCss(".date > span:nth-child(2)").click();
        getElementCss(".datepicker-days > table:nth-child(1) > tfoot:nth-child(3) > tr:nth-child(1) > th:nth-child(1)").click();
        String datum = getElementCss(".date > input:nth-child(1)").getText();
        System.out.println(datum);

        //not working properly

    }
    @Test
    public void DateRange() {
        driver.get("https://www.seleniumeasy.com/test/bootstrap-date-picker-demo.html");

        getElementCss("#datepicker > input:nth-child(1)").click();
        WebElement datum = getElementCss(".datepicker-days > table:nth-child(1)");
        List<WebElement> ele = datum.findElements(By.tagName("td"));

        for (int i = 0; i < ele.size(); i++) {
            int random = (int )(Math.random() * 3 + 1);
            ele.get(random).click();
            break;
        }
        String as1=getElementCss("#datepicker > input:nth-child(1)").getText();
        String as2=getElementCss("input.form-control:nth-child(3)").getText();
        Assertions.assertEquals(as1,as2);
    }

    @Test
    public void jqueryDatePicker() {
        driver.get("https://www.seleniumeasy.com/test/jquery-date-picker-demo.html");
        getElementCss("#from").click();
        WebElement datum = getElementCss(".ui-datepicker-calendar");
        List <WebElement> ele = datum.findElements(By.tagName("td"));

        for (int i = 0; i < ele.size(); i++) {
            int random = (int )(Math.random() * 30 + 1);
            ele.get(random).click();
            break;
        }
        String vtx1 = getElementCss("#from").getText();
        getElementCss("#to").click();
        WebElement datum1 = getElementCss(".ui-datepicker-calendar");
        List <WebElement> ele1 = datum1.findElements(By.tagName("td"));

        for (int i = 0; i < ele.size(); i++) {
            int random = (int )(Math.random() * 30 + 1);
            ele1.get(random).click();
            break;
        }
        String vtx2 = getElementCss("#to").getText();
        System.out.println(vtx1);
        System.out.println(vtx2);
        //nu afiseaza datele in consola
    }
}
