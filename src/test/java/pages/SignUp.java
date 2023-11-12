package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUp {

//    @FindBy(xpath= "//a[contains(.,'Phones')]")
//    public WebElement signUpAnaSayfaButonu;

    @FindBy(xpath= "//a[text()='Sign up']")
    public WebElement signUpAnaSayfaButonu;

    @FindBy(xpath="//input[@id='sign-username']")
    public WebElement userNameMetinKutusu;

    @FindBy(xpath="//input[@id='sign-password']")
    public WebElement passwordMetinKutusu;

    @FindBy(xpath="//button[@onclick='register()']")
    public WebElement signUpSignSayfaButonu;









}
