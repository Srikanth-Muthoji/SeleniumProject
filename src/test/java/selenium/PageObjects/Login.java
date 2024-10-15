package selenium.PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

WebDriver driver;

public Login(WebDriver driver){
    this.driver=driver;
}
    public void UserClicksonMacBook(WebDriver driver){
        WebElement Login = driver.findElement(By.xpath("//a[contains(text(),'MacBook')]"));
        Login.click();
    }

}
