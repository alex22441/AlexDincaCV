import org.apache.bcel.generic.Select;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class ListBox extends AbstractMain {
    @Test
    public void bootstrapListBox() throws Exception  {
        driver.get("https://www.seleniumeasy.com/test/bootstrap-dual-list-box-demo.html");
        getElementCss("input.form-control:nth-child(2)").sendKeys("Morbi leo risus");
        getElementCss("div.col-md-2:nth-child(2) > div:nth-child(1) > a:nth-child(1)").click();
        getElementCss("button.btn:nth-child(2)").click();
        getElementCss("input.form-control:nth-child(1)").sendKeys("Morbi leo risus");
        getElementCss("div.col-md-2:nth-child(1) > div:nth-child(1) > a:nth-child(1)").click();
        getElementCss("button.btn:nth-child(1)").click();
        this.takeSnapShot(driver, "C:\\Users\\Alex\\IdeaProjects\\Guru99project\\ErrorPNG\\bootstrapBox.png");
    }

    @Test
    public void jqueryListBox(){
        driver.get("https://www.seleniumeasy.com/test/jquery-dual-list-box-demo.html");
        getElementCss(".pAddAll").click();
        List<WebElement> forms = driver.findElements(By.tagName("option"));
        int count = forms.size();
        int actualcount = 15;
        Assertions.assertEquals(actualcount,count);

    }

    @Test
    public void  dataListFilter(){
        driver.get("https://www.seleniumeasy.com/test/data-list-filter-demo.html");
        getElementCss("#input-search").sendKeys("Tyreese");
        String text = getElementCss("div.items:nth-child(1) > div:nth-child(1)").getText();
        System.out.println(text);
        getElementCss("#input-search").clear();

    }
}
