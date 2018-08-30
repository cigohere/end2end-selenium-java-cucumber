package com.shopback.env;

import com.shopback.utils.PropertyReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static WebDriver driver = null;
    private static DesiredCapabilities capabilities = null;
    public static WebDriver CreateWebDriver()
    {
        String browserName = new PropertyReader().readConfigProperties("browser");
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--headless");
        switch(browserName.toLowerCase()) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver(chrome_options);
                break;
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }


}
