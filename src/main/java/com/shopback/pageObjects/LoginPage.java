package com.shopback.pageObjects;

import com.shopback.utils.SeleniumUntils;

public class LoginPage {

    private SeleniumUntils seleniumUntils = new SeleniumUntils();

    public LoginPage clickGoogleSignInButton() {
        seleniumUntils.clickElement("css", "#root div a");
        return new LoginPage();
    }

    public void enterEmail(String email) {
        seleniumUntils.enterText("id", "identifierId", email);
    }

    public void clickNextButton() {
        seleniumUntils.clickElement("xpath", "//div[@id='identifierNext']/content/span");
    }

    public void enterPassword(String password) {
        seleniumUntils.enterText("name", "password", password);
    }

    public void clickNextButtonToLogin() {
        seleniumUntils.clickElement("xpath", "//div[@id='passwordNext']/content/span");
    }

    public NeedlePage googleSignIn(String email, String password) {
        clickGoogleSignInButton();
        enterEmail(email);
        clickNextButton();
        enterPassword(password);
        clickNextButtonToLogin();
        return new NeedlePage();
    }


}
