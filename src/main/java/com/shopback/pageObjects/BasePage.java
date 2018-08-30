package com.shopback.pageObjects;

import com.shopback.utils.PropertyReader;
import com.shopback.utils.SeleniumUntils;

public class BasePage {

    public static LoginPage navigateToLoginPage() {


        SeleniumUntils seleniumUntils = new SeleniumUntils();
        String url = new PropertyReader().readConfigProperties("url");
        seleniumUntils.navigateToURL(url);
        try {
            Thread.sleep(500);
        } catch (Exception e) {}
        return new LoginPage();
    }
}
