package tests.bdd.pages;

import net.serenitybdd.core.pages.PageObject;

import java.time.temporal.ChronoUnit;

public class GoogleSearchPage extends PageObject {

    public void openGoogleSearchPage() {
        open();
    }

    public void enterKeywordInGoogleSearchBox(String keyword) {
        $("//input[@name='q']").sendKeys("Cucumber");
    }

    public void clickGoogleSearchButton() {
        setImplicitTimeout(10, ChronoUnit.SECONDS);
        $("//input[@value='Google Search']").click();
    }
}
