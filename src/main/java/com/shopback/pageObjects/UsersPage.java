package com.shopback.pageObjects;


import com.shopback.utils.SeleniumUntils;
import org.openqa.selenium.WebElement;

public class UsersPage {

    private SeleniumUntils seleniumUntils = new SeleniumUntils();

    public WebElement allUsersTab = seleniumUntils.waitWebElement("css", "#root div div div div div div div button span span span");

    public WebElement searchTextField = seleniumUntils.waitWebElement("css", "#root div div div div div div input");
}
