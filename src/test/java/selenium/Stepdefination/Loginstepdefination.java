package selenium.Stepdefination;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import selenium.PageObjects.ElementFunctions;
import selenium.PageObjects.Login;

import java.time.Duration;
import java.util.Scanner;


public class Loginstepdefination {
     WebDriver driver;
     ElementFunctions elementFunctions;
    Login login;
     public Loginstepdefination() {

         login = new Login(driver);
         elementFunctions = new ElementFunctions(driver);
     }

//     @Before
//     public void getscenarioconetct(Scenario sc){
//         sc.
//     }
//
//     @After
//     public  void getscenaroafter(Scenario sc){
//         sc.getName();
//     }

    @Given("user is naviagting to Orange HRM page")
    public void user_is_naviagting_to_orange_hrm_page(){
        ChromeOptions options = new ChromeOptions();
                    options.addArguments("--remote-allow-origins=*");
                    options.addArguments("--disable-gpu");
                    driver = new ChromeDriver(options);
                    driver.manage().window().maximize();
                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
                    driver.get("https://naveenautomationlabs.com/opencart/");
                    elementFunctions.getScreeshotofWholePagewithScreenShotName(driver,"screenshots","Login page");
        //Assert.assertEquals();

    }

    @And("user Clicks on Mac book")
    public void user_clicks_on_mac_book(){

         login.UserClicksonMacBook(driver);
        elementFunctions.getScreeshotofWholePagewithScreenShotName(driver,"screenshots","Macbook page");
    driver.quit();
     }

}
