package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.MyAccountsPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class MyAccountsPageTest extends BaseTest {
    MyAccountsPage myAccountsPage = new  MyAccountsPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.clickOnRegisterLink();
      //  myAccountsPage.verifyRegisterAccount();
    }

    @Test
    public void verifyUserShouldNavigateToLoginPageSuccessfully() {
        myAccountsPage.clickOnMyAccountLink();
        myAccountsPage.clickOnLoginLink();
      //  myAccountsPage.verifyReturnCustomer();

    }

}
