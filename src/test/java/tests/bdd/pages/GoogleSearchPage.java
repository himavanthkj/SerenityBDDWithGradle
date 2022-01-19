package tests.bdd.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

import java.time.temporal.ChronoUnit;

//@DefaultUrl("http://www.google.com")
public class GoogleSearchPage extends PageObject {

//    public void openGoogleSearchPage() {
//        open();
//    }

    public void enterKeywordInGoogleSearchBox(String keyword) {
//        $("//input[@name='q']").sendKeys(keyword);
        typeInto($("//input[@name='q']"), keyword);
    }

    public void clickGoogleSearchButton() {
        setImplicitTimeout(10, ChronoUnit.SECONDS);
//        $("//input[@value='Google Search']").click();
        clickOn($("//input[@value='Google Search']"));
    }
}
