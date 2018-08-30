package com.shopback.utils;

import com.shopback.env.DriverFactory;
import com.shopback.stepDefinitions.Hooks;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUntils{

    WebDriver driver = Hooks.driver;

    public void navigateToURL(String url)
    {
        driver.get(url);
    }
    public  void enterText(String type, String accessName, String textValue) {
        waitWebElement(type, accessName).sendKeys(textValue);
    }

    public void clickElement(String type, String accessName)
    {
        waitWebElement(type, accessName).click();
    }

    public void selectDropDownValue(String type, String accessName)
    {
        WebElement dropdownMenu = getWebElement(type, accessName );
        dropdownMenu.click();
    }

    public WebElement getWebElement(String type, String accessName) {

        switch (type) {
            case "id":
                return driver.findElement(By.id(accessName));
            case "name":
                return driver.findElement(By.name(accessName));
            case "class":
                return driver.findElement(By.className(accessName));
            case "xpath":
                return driver.findElement(By.xpath(accessName));
            case "css":
                return driver.findElement(By.cssSelector(accessName));
            case "linkText":
                return driver.findElement(By.linkText(accessName));
            case "partialLinkText":
                return driver.findElement(By.partialLinkText(accessName));
            case "tagName":
                return driver.findElement(By.tagName(accessName));
            default:
                return null;
        }
    }

    public WebElement waitWebElement(String type,String accessName)
    {
        WebDriverWait Wait = new WebDriverWait(driver, 120);
        return Wait.until(ExpectedConditions.elementToBeClickable(getWebElement(type,accessName)));
    }
}
