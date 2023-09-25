package com.interview.pages;

import com.github.javafaker.Faker;
import com.interview.utilities.BrowserUtils;
import com.interview.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsPage {

    public ContactUsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath="//h3[.='Contact Sales']")
    public WebElement contactSales;

    @FindBy(xpath="//iframe[@type='text/html']")
    public WebElement infoTable;

    @FindBy(xpath="(//input[@type='text'])[1]")
    public WebElement firstName;

    @FindBy(xpath="(//input[@type='text'])[2]")
    public WebElement lastName;
    @FindBy(xpath="(//input[@type='text'])[3]")
    public WebElement jobTitle;

    @FindBy(xpath="(//input[@type='text'])[4]")
    public WebElement company;

    @FindBy(xpath="(//input[@type='text'])[5]")
    public WebElement email;

    @FindBy(xpath="(//input[@type='text'])[6]")
    public WebElement phone;

    @FindBy(id="321851_98809pi_321851_98809")
    public WebElement comment;
    
    @FindBy(xpath="(//select[@class='select'])[1]")
    public WebElement country;

    @FindBy(xpath="(//select[@class='select'])[2]")
    public WebElement interestArea;

    @FindBy(id="321851_98812pi_321851_98812_1441024")
    public WebElement checkbox;

    @FindBy(xpath="//a[@class='btn']")
    public WebElement submit;

    @FindBy(xpath = "//div[@class='container']//iframe")
    public WebElement submission;

    @FindBy(xpath="//*[@id='pardot-form']/h3")
    public WebElement message;
    Faker faker= new Faker();
    public String formSubmission(){
        Driver.getDriver().switchTo().frame(infoTable);
        firstName.sendKeys(faker.name().firstName());
        lastName.sendKeys(faker.name().lastName());
        jobTitle.sendKeys(faker.job().title());
        BrowserUtils.waitForClickablility(company,10);
        company.sendKeys(faker.company().name());
        email.sendKeys(faker.bothify("###@###.com"));
       // email.sendKeys(faker.letterify("????-???-???"));
        phone.sendKeys(faker.numerify("###-###-####"));
        BrowserUtils.waitForClickablility(comment,10);
        comment.sendKeys(faker.letterify("????-???-???"));
        country.click();

        Select selectCountry= new Select(country);
        selectCountry.selectByVisibleText("Portugal");
       BrowserUtils.scrollToElement(interestArea);
        Select selectArea= new Select(interestArea);
        selectArea.selectByVisibleText("Quote & Order");
        checkbox.click();
       submit.click();
       Driver.getDriver().switchTo().defaultContent();
       Driver.getDriver().switchTo().frame(submission);
       return message.getText();

    }


}
