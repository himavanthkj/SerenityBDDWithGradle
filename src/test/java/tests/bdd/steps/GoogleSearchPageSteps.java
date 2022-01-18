package tests.bdd.steps;

import net.thucydides.core.annotations.Step;
import tests.bdd.pages.GoogleSearchPage;

public class GoogleSearchPageSteps {

    static GoogleSearchPage googleSearchPage;

    @Step
    public void performGoogleSearchForKeyword(String keyword) {
        googleSearchPage.openGoogleSearchPage();
        googleSearchPage.enterKeywordInGoogleSearchBox(keyword);
        googleSearchPage.clickGoogleSearchButton();
    }
}
