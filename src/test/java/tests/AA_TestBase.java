package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


public class AA_TestBase {
    public static WebDriver driver;
    public WebDriverWait waitForTenSeconds, waitForThirtySeconds;

    @BeforeClass
    @Parameters({"browser"})
    public void startDriver(@Optional("chrome") String browserName) {
        if (browserName.equalsIgnoreCase("chrome")) {
            String chromepath = System.getProperty("user.dir") + "\\resources\\chromedriver.exe";
            System.setProperty("webdriver.chrome.driver", chromepath);
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            String firefoxpath = System.getProperty("user.dir") + "\\resources\\geckodriver.exe";
            System.setProperty("webdriver.gecko.driver", firefoxpath);
            driver = new FirefoxDriver();
        }

        driver.manage().deleteAllCookies();
        String url = "https://app-test.postscanmail.com/registration?plan=5370&store=6&address=1004";
        driver.navigate().to(url);
        driver.manage().window().maximize();
        waitForTenSeconds = new WebDriverWait(driver, Duration.ofSeconds(10));
        waitForThirtySeconds = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @AfterClass
    public void quitDriver() {
        driver.quit();
    }


}
