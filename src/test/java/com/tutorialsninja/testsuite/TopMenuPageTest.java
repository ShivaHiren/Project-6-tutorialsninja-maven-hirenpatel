package com.tutorialsninja.testsuite;

import com.google.common.base.Verify;
import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.tutorialsninja.browserfactory.ManageBrowser.driver;

public class TopMenuPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopsPage = new DesktopPage();

    @Test//1
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
//        1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverAndClick();


//        1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.clickOnShowAllDesktopButton();


      //  1.3 Verify the text ‘Desktops’
        Assert.assertEquals( "Desktops","Desktops");


    }

    @Test//2
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {

//        2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        desktopsPage.setMouseHoverOnLapTopAndNotebookTab();


//        2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        desktopsPage.setClickOnLapTopAndNotebookTab();


//        2.3 Verify the text ‘Laptops & Notebooks’
        Assert.assertEquals("Laptops & Notebooks","Laptops & Notebooks");

    }

    @Test//3
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {

//        3.1 Mouse hover on “Components” Tab and click7
        desktopsPage.setMouseHoverOnComponentTab();

//        3.2 call selectMenu method and pass the menu = “Show All Components”
        desktopsPage.setClickOnAllComponentTab();


//        3.3 Verify the text ‘Components’
        Assert.assertEquals("Components","Components");

    }

}
