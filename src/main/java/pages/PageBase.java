package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
    protected WebDriver driver;
    public JavascriptExecutor js;
    public Actions act;

    public PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void ScrollDownToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void ScrollUpToElement(WebElement element) {
        js.executeScript("arguments[0].scrollIntoView(false);", element);
    }


}

