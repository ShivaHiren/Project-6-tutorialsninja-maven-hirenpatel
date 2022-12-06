package com.tutorialsninja.pages;

import com.tutorialsninja.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By firstNameField = By.xpath("//input[@id='input-firstname']");
    By lastNameField = By.xpath("//input[@id='input-lastname']");
    By emailIdField = By.xpath("//input[@id='input-email']");
    By phoneNumberField = By.xpath("//input[@id='input-telephone']");
    By passwordField = By.xpath("//input[@id='input-password']");
    By passwordConfirmField = By.xpath("//input[@id='input-confirm']");
    By radioButton = By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/fieldset[3]/div[1]/div[1]/label[2]/input[1]");
    By privacyPolicy =By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[1]");
    By continueButton =By.xpath("//body/div[@id='account-register']/div[1]/div[1]/form[1]/div[1]/div[1]/input[2]");
    By continueButtonLink = By.xpath("//a[contains(text(),'Continue')]");
    By myAccountLink = By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[1]");
    By logOut =By.xpath("//body/div[@id='account-account']/div[1]/aside[1]/div[1]/a[13]");
    By lastContinueButton = By.xpath("//a[@class='btn btn-primary']");
    By loginButton = By.xpath("//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]");
    By logoutButton = By.linkText("Logout");

    public void logoutButton(){
        clickOnElement(logoutButton);
    }
    public void loginButton(){
        clickOnElement(loginButton);
    }

    public void lastContinueButton(){
        clickOnElement(lastContinueButton);
    }

    public void enterFirstNameField(String firstname){
        sendTextToElement(firstNameField,firstname);
    }

    public void enterLastNameField(String lastName){
        sendTextToElement(lastNameField,lastName);
    }

    public void enterEmailIdField(String emailId){
        sendTextToElement(emailIdField,emailId );
    }

    public void enterPhoneNumberField(String phoneNumber){
        sendTextToElement(phoneNumberField,phoneNumber);
    }

    public void enterPasswordField (String password){
        sendTextToElement(passwordField,password);
    }

    public void enterPasswordConfirmField(String passwordConfirm){
        sendTextToElement(passwordConfirmField,passwordConfirm);
    }

    public void clickOnRadioButton(){
        clickOnElement(radioButton);
    }

    public void clickOnPrivacyPolicy(){
        clickOnElement(privacyPolicy);
    }

    public void clickOnContinueButton(){
        clickOnElement(continueButton);
    }

    public void clickOnContinueButtonLink(){
        clickOnElement(continueButtonLink);
    }

    public void clickOnMyAccountLink(){
        clickOnElement(myAccountLink);
    }

    public void clickOnLogOut(){
        clickOnElement(logOut);}


}
