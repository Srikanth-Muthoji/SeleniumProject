package com.Runner;


import io.cucumber.junit.Cucumber;

import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;



@RunWith(Cucumber.class)
@CucumberOptions( tags = "@Apply",
        features = "src/test/resources/Features",
        glue = {"selenium.Stepdefination"},
        plugin={"json:target/cucumber/Report.json"}
)
public class  AbstractRunnerclass {


    public static  WebDriver driver;
}
  //  private static final Logger logger = Logger.getLogger(AbstractRunnerclass.class);


//    public void runtest() {
//        List<String> browsers = browser();
//        System.out.println("browser initlaised" + browsers);
//    }


//    String browser;
//    Boolean runtype;
//
//    private WebDriver driver;
//
//
//    public List<String> browser() {
//        Properties prof = new Properties();
//        try {
//
//            FileInputStream file = new FileInputStream("src/test/java/selenium/properties/config.properties");
//            prof.load(file);
//            file.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//        browser = prof.getProperty("browserName");
//        String run = prof.getProperty("LocalRun");
//        runtype = Boolean.parseBoolean(run);
//        // logger.error("incorrect Config. use Either TRUE / FALSE for LocalRun");
//
//        List<String> browsers = new ArrayList<>();
//
//        if (runtype) {
//            switch (browser) {
//                case "chrome":
//                    ChromeOptions options = new ChromeOptions();
//                    options.addArguments("--remote-allow-origins=*");
//                    options.addArguments("--disable-gpu");
//                    driver = new ChromeDriver(options);
//                    driver.manage().window().maximize();
//                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//                    //driver.get("https://naveenautomationlabs.com/opencart/");
//                    browsers.add(String.valueOf(driver));
//                    break;
//                case "edge":
//                    EdgeOptions option = new EdgeOptions();
//                    option.addArguments("--remote-allow-origins=*");
//                    driver = new EdgeDriver(option);
//                    driver.manage().window().maximize();
//                    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
//                    browsers.add(String.valueOf(driver));
//                    break;
//                default:
//                    throw new IllegalArgumentException(" unsuu" + browser);
//            }
//        }
//        return browsers;





