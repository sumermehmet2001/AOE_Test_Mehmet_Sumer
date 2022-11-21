package aoeTest.pages;

import aoeTest.utilities.ConfigurationReader;
import aoeTest.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class AOETestPage extends BasePage{


    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    public WebElement cookieBtn;
    @FindBy(xpath = "//a[@data-qa='nav_main_6']")
    public WebElement careerBtn;
    @FindBy(xpath = "//a[@data-qa='nav_main_6_4']")
    public WebElement vacanciesBtn;
    @FindBy(xpath = "//input[@id='filter-keyword']")
    public WebElement keywordBtn;

    @FindBy(xpath = "//a[@data-qa='vacancies_table_16']")
    public WebElement vacancyFrontent;
    @FindBy(xpath = "//a[contains(@data-qa,'vacancies_table')][contains(text(),'Frontend')]/..")
    public List<WebElement> jobOffering;

    @FindBy(css = "a[data-qa='vacancies_table_16']")
    public WebElement jobOffering1;

    @FindBy(xpath = "//h1[contains(text(),'Frontend / React Developer (m/f/d), remote')]")
    public WebElement verifyOption;

    public WebElement offering(String vacancy) {
        WebElement offer = Driver.get().findElement(By.xpath("//a[contains(@data-qa,'vacancies_table')][contains(text(),'" + vacancy + "')]"));
        return offer;
    }

    public List<WebElement> listOfVacanciesFiltered() {

        String keywordSend = ConfigurationReader.get("keyword");
        List<WebElement> jobOffer =Driver.get().findElements(By.xpath("//a[contains(@data-qa,'vacancies_table')][contains(text(),'" + keywordSend + "')]/.."));
        return jobOffer;
    }

    public WebElement verifyOption1(String keyword) {
        WebElement verificationStatement = Driver.get().findElement(By.xpath("//h1[contains(text(),'"+keyword+"')]"));
        return verificationStatement;
    }


//In Page Factory, testers use @FindBy annotation. The initElements method is used to initialize web elements.
//@FindBy: An annotation used in Page Factory to locate and declare web elements using different locators.
// Below is an example of declaring an element using @FindBy


}
