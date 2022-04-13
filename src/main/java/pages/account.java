package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class account extends PageBase {

    public account(WebDriver driver) {
        super(driver);
        js = (JavascriptExecutor) driver;
        act = new Actions(driver);
    }

    //Web elements
    @FindBy(xpath = "//*[@controlname='first_name']/descendant::input")
    public WebElement firstName;

    @FindBy(xpath = "//*[@controlname='last_name']/descendant::input")
    public WebElement lastName;

    @FindBy(xpath = "//*[@controlname='email']/descendant::input")
    public WebElement email;

    @FindBy(xpath = "//*[@controlname='phone']/descendant::input")
    public WebElement phone;


    //Methods
    public void fillPhone(String phoneNr) {
        phone.sendKeys(phoneNr);
    }

    public void fillSomeFields(String phone, String firstName, String lastName, String email) {
        this.phone.sendKeys(phone);
        this.firstName.sendKeys(firstName);
        this.lastName.sendKeys(lastName);
        this.email.sendKeys(email);
    }


}
