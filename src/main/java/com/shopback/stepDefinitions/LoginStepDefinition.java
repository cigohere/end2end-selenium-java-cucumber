package com.shopback.stepDefinitions;

import com.shopback.pageObjects.BasePage;
import com.shopback.pageObjects.LoginPage;
import com.shopback.utils.PropertyReader;
import cucumber.api.java.en.Given;

public class LoginStepDefinition {

    @Given("I have logged into Needle page")
    public void loginNeedlePage() {
        LoginPage loginPage = BasePage.navigateToLoginPage();
        PropertyReader propertyReader = new PropertyReader();
        String email = propertyReader.readConfigProperties("email");
        String password = propertyReader.readConfigProperties("password");
        loginPage.googleSignIn(email, password);
    }
}
