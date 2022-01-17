package tests.SeleniumWithSerenity;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import java.time.temporal.ChronoUnit;

@RunWith(SerenityRunner.class)
@DefaultUrl("http://www.google.com")
public class NewGoogleTest extends PageObject {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Title("Performing Google Search!!!")
    @Test
    public void googleSearch() {

        open();
        getDriver().manage().window().maximize();
        $("//input[@name='q']").sendKeys("Cucumber");
        setImplicitTimeout(10, ChronoUnit.SECONDS);
        $("//input[@value='Google Search']").click();
        boolean checkSearch = $("//h3[1]").getText().contains("Cucumber");
        if(!checkSearch) {
            System.out.println("Search results match with keyword Cucumber");
        } else {
            System.out.println("Search results does not match with keyword Cucumber");
        }
    }
}
