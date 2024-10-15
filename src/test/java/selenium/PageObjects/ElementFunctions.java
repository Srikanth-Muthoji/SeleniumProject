package selenium.PageObjects;

import org.openqa.selenium.WebDriver;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import java.io.File;
import java.text.SimpleDateFormat;

public class ElementFunctions {
WebDriver driver;


public ElementFunctions(WebDriver driver){
     this.driver=driver;
}

    public static void waitForSeconds(int timeInSeconds){
        try {
            Thread.sleep(timeInSeconds*1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new java.util.Date());
    }

    public void  getScreeshotofWholePagewithScreenShotName(WebDriver driver,String path,String name){

        try {
            File folderpath =new File(path);
            if(!folderpath.exists()){
                folderpath.mkdir();
            }
            waitForSeconds(2);
            Screenshot fpscreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportRetina(1000,0,0,1.5f)).takeScreenshot(driver);
            ImageIO.write(fpscreenshot.getImage(),"PNG",new File(path + "\\" + timestamp() + "-" + name + ".png"));
            waitForSeconds(2);
        }
         catch (Exception ex) {
             ex.printStackTrace();
        }
    }


}
