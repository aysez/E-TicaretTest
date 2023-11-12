package stepdefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CommonPage;
import utility.Methods;

import static hooks.Hooks.driver;

public class SignUpStepDefs extends CommonPage {

    Faker faker = new Faker();

    @Given("Kullanici siteye gider")
    public void kullanici_siteye_gider() {
        getMethods().navigateToUrl();
    }

    @When("Kullanici sign up butonunu gorur")
    public void kullanici_sign_up_butonunu_gorur() {
        getSignUp().signUpAnaSayfaButonu.isEnabled();
    }

    @Then("Kullanici sign up butonuna tiklar")
    public void kullanici_sign_up_butonuna_tiklar() {
        getSignUp().signUpAnaSayfaButonu.click();
    }

    @Then("Kullanici username bilgilerini girer")
    public void kullanici_username_bilgilerini_girer() {
        getSignUp().userNameMetinKutusu.sendKeys("deneme" + faker.number().digits(10000 - 20000));
    }

    @Then("Kullanici password bilgilerini girer")
    public void kullanici_password_bilgilerini_girer() {
        getSignUp().passwordMetinKutusu.sendKeys("deneme12345");

    }

    @When("Kullanici sign up succesfull mesajini goruntuler")
    public void kullanici_sign_up_succesfull_mesajini_goruntuler() {
        getMethods().wait(2);

    }

    @Then("Kullanici tamam butonuna basar")
    public void kullanici_tamam_butonuna_basar() {
        driver.switchTo().alert().accept();
    }
}
