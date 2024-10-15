package com.Runner;

import org.openqa.selenium.*;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;



public class Selenium_functions {

    @Test
    public void draganddrop()  {
        WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

//        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//
//        WebElement element = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Prompt')]"));
//
//        element.click();
//
//       // JavascriptExecutor js=  (JavascriptExecutor)driver;
//        Alert alert = driver.switchTo().alert();
//
//        // Get the text displayed on the alert
//        String alertMessage = alert.getText();
//        System.out.println(alertMessage);
////        alert.dismiss();
//        alert.sendKeys("Hi");
//        alert.accept();
//
//        WebElement element1 = driver.findElement(By.id("result"));
//
//        element1.getText();
//
//        System.out.println(element1);







//        driver.switchTo().frame(1);
//
//        WebElement frameleft = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
//
//       frameleft.getAttribute("value");
//
//       driver.switchTo().defaultContent();
//
//        driver.switchTo().frame("frame_middle");
//
//        //System.out.println("Slider value: " + frameleft);
//
//        WebElement framemiddle = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
//
//        frameleft.getAttribute("value");
//
//        driver.switchTo().defaultContent();

       // driver.switchTo().frame(framemiddle);

        //framemiddle.getAttribute("value");

        //System.out.println("Slider value: " + framemiddle);

//        WebElement frame_right = driver.findElement(By.xpath("//frame[@name='frame-right']"));
//
//        WebElement framebottom = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));


//        driver.get("https://the-internet.herokuapp.com/drag_and_drop");
//
//        WebElement source = driver.findElement(By.id("column-a"));
//        WebElement target = driver.findElement(By.id("column-b"))
//                ;
//
//        // Perform drag and drop
//        Actions actions = new Actions(driver);
//        actions.dragAndDrop(source, target).perform();
//
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }

        // Clean up
        //div[@class='large-10 columns']//tr[5]//td//a[1]

//        driver.get("https://the-internet.herokuapp.com/download");
//
//        WebElement source = driver.findElement(By.xpath("//a[contains(text(),'Book1.xlsx')]"));
//
//        source.click();

//        driver.get("https://the-internet.herokuapp.com/horizontal_slider");
//
        WebElement slider = driver.findElement(By.cssSelector("input[type=range]"));
//
        Actions move = new Actions(driver);

        //move.dragAndDropBy()

        move.clickAndHold(slider)
                .moveByOffset(80, 0) // Adjust the offset to slide the desired distance
                .release()
                .perform();

        // Optional: Get slider's value after moving
//        int sliderWidth = slider.getSize().getWidth();
//
//        String sliderValue = sli
//        der.getAttribute("value");
//        System.out.println("Slider value: " + sliderValue);
//        System.out.println("Slider value: " + sliderWidth);
        driver.quit();

        //button[@onclick='swapCheckbox()']

    }
}
