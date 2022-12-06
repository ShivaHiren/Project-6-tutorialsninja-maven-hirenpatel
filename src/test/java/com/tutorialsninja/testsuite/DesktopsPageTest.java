package com.tutorialsninja.testsuite;


import com.tutorialsninja.pages.DesktopPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPageTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopPage desktopsPage = new DesktopPage();


    @Test//1
    public void verifyProductArrangeInAlphaBaticalOrder() {

//        1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverAndClick();

//        1.2 Click on “Show All Desktops”
        homePage.clickOnShowDesktopButton();

//        1.3 Select Sort By position "Name: Z to A"
        desktopsPage.selectByIndex();


//        1.4 Verify the Product will arrange in Descending order.
        Assert.assertEquals(getTextFromElement(By.xpath("//h4/a")), "Sony VAIO", "Sony VAIO");

    }

    @Test//2
    public void verifyProductAddedToShoppingCartSuccessFully() {
        //    2.1 Mouse hover on Desktops Tab. and click
        homePage.mouseHoverAndClick();

//    2.2 Click on “Show All Desktops”
        homePage.clickOnShowDesktopButton();

//    2.3 Select Sort By position "Name: A to Z"
        desktopsPage.selectByAtoZ();


//    2.4 Select product “HP LP3065”
        homePage.clickOnContentButton(By.xpath("//a[contains(text(),'HP LP3065')]"));

//    2.5 Verify the Text "HP LP3065"
        Assert.assertEquals("HP LP3065", "HP LP3065",
                getTextFromElement(By.xpath("//h1[contains(text(),'HP LP3065')]")));


//    2.6 Select Delivery Date "2022-11-30"
        desktopsPage.dateSelection();

//    2.8 Click on “Add to Cart” button
        homePage.clickOnAddToCartButton();

//  2.9 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        Assert.assertEquals(getTextFromElement(By.xpath("//a[contains(text(),'shopping cart')]")), "shopping cart", "shopping cart");

//    2.10 Click on link “shopping cart” display into success message
        homePage.clickOnShoppingCartButton();

//    2.11 Verify the text "Shopping Cart"
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@id='content']//h1")), "Shopping Cart  (1.00kg)", "Shopping Cart  (1.00kg)");

//    2.12 Verify the Product name "HP LP3065"
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a")), "HP LP3065", "HP LP3065");

//    2.13 Verify the Delivery Date "2022-11-30"
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/small[1]")), "Delivery Date: 2023-11-30", "Delivery Date: 2023-11-30");


//    2.14 Verify the Model "Product21"
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[3]")), "Product 21", "Product 21");


//    2.15 Verify the Total "£74.73"//button[@id='button']
        homePage.changeCurrency();
        homePage.selectCurrency();
        Assert.assertEquals(getTextFromElement(By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]")), "£74.73", "£74.73");
    }

}


