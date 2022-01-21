package tests.OnlySelenium;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GoogleTest {

    @Ignore
    @Test
    public void firstTest() {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/windows/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Cucumber");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@value='Google Search']")).click();
        boolean checkSearch = driver.findElement(By.xpath("//h3[1]")).getText().contains("Cucumber");
        if(!checkSearch) {
            System.out.println("Search results match with keyword Cucumber");
        } else {
            System.out.println("Search results does not match with keyword Cucumber");
        }
        driver.quit();

    }
}
