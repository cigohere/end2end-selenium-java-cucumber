package com.shopback.pageObjects;

import com.shopback.utils.SeleniumUntils;
import org.openqa.selenium.WebElement;

public class CustomerProfilePage {

    private SeleniumUntils seleniumUntils = new SeleniumUntils();

    public WebElement searchByDropDown = seleniumUntils.waitWebElement("css", "#root div div div div div div div div div div div");

}
