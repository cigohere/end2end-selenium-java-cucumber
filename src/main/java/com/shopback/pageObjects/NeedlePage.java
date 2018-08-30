package com.shopback.pageObjects;

import com.shopback.utils.SeleniumUntils;
import org.openqa.selenium.WebElement;

public class NeedlePage {

    private SeleniumUntils seleniumUntils = new SeleniumUntils();

    public WebElement headerTitle = seleniumUntils.getWebElement("css", "#root div div div h1");

    public WebElement topLeftEmail = seleniumUntils.getWebElement("css", "#root div div div li div span");

    public WebElement groupTitlePage = seleniumUntils.getWebElement("css", "#root div div div div nav div");

    public WebElement usersLink = seleniumUntils.getWebElement("linkText", "Users");

    public WebElement cusomerProfileLink = seleniumUntils.getWebElement("linkText", "Customer Profile");
}
