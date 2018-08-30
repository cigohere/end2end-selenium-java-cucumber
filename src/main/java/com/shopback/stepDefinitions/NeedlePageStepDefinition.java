package com.shopback.stepDefinitions;

import com.shopback.pageObjects.NeedlePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class NeedlePageStepDefinition {

    private NeedlePage homePage = new NeedlePage();;

    @Then("The header title should be displayed as \"([^\"]*)\"")
    public void verifyHeaderTitle(String expectedHeaderTitle) {
        String actualHeaderTitle = homePage.headerTitle.getText();
        assert(actualHeaderTitle.trim().contains(expectedHeaderTitle.trim()));
    }

    @And("The top left email should be displayed as \"([^\"]*)\"")
    public void verifyTopLeftEmail(String expectedTopLeftEmail) {
        String actualTopLeftEmail = homePage.topLeftEmail.getText();
        assert(actualTopLeftEmail.trim().contains(expectedTopLeftEmail.trim()));
    }

    @And("The group title of Users page should be displayed as \"([^\"]*)\"")
    public void verifyGroupTitlePage(String expectedGroupTitlePage)
    {
        String actualGroupTitlePage = homePage.groupTitlePage.getText();
        assert(actualGroupTitlePage.trim().contains(expectedGroupTitlePage.trim()));
    }
}
