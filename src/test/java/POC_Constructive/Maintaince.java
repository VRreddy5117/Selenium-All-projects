package POC_Constructive;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Maintaince {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "D:\\chrome driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.getTitle();
        driver.get("https:\\www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.close();

    }
}
