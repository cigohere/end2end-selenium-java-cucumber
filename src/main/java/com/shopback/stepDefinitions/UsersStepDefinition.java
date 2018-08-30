package com.shopback.stepDefinitions;

import com.shopback.pageObjects.NeedlePage;
import com.shopback.pageObjects.UsersPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;


public class UsersStepDefinition {

    private NeedlePage needlePagePage = new NeedlePage();
    private UsersPage usersPage;

    @When("I open Users page")
    public void openUserPage()
    {
        needlePagePage.usersLink.click();
    }

    @And("I click on All Users tab")
    public void openAllUsersTab()
    {
        usersPage = new UsersPage();
        try {
            Thread.sleep(500);
        } catch (Exception e) {}
        usersPage.allUsersTab.click();
    }

    @When("I enter value as \"([^\"]*)\" into search field")
    public void enterValueToSearch(String searchValue)
    {
        usersPage.searchTextField.sendKeys(searchValue);
    }
}
