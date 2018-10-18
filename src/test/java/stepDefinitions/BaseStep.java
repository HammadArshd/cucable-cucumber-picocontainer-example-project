package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseStep {

    public WebDriver driver = null;

    @Before
    public void setUp() throws Exception {
//        driver = SeleniumUtil.getWebDriver(ConfigUtil.readKey("browser"));
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }


}
