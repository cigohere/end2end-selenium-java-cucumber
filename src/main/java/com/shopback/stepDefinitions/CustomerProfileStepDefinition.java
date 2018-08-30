package com.shopback.stepDefinitions;

import com.shopback.pageObjects.CustomerProfilePage;
import com.shopback.pageObjects.NeedlePage;
import com.shopback.utils.SeleniumUntils;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class CustomerProfileStepDefinition {

    private NeedlePage needlePage = new NeedlePage();
    private CustomerProfilePage customerProfilePage;
    private SeleniumUntils seleniumUntils = new SeleniumUntils();

    @When("I open Custom Profile page")
    public void openCustomProfilePage()
    {
        needlePage.cusomerProfileLink.click();
    }

    @And("I select search by \"([^\"]*)\"")
    public void selectSearchBy(String searchBy) {
        customerProfilePage = new CustomerProfilePage();
        customerProfilePage.searchByDropDown.click();
        seleniumUntils.selectDropDownValue("xpath", "//div[@id='menu-']/div[2]/ul/li[contains(@data-value,'" + searchBy + "')]");
    }
}
