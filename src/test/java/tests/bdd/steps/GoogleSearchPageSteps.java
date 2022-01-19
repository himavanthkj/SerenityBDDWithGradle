package tests.bdd.steps;

import net.thucydides.core.annotations.Step;
import tests.bdd.pages.GoogleSearchPage;

public class GoogleSearchPageSteps {

    private GoogleSearchPage googleSearchPage;

    @Step
    public void openGoogleSearch() {
        googleSearchPage.open();
    }

    @Step
    public void performGoogleSearchForKeyword(String keyword) {
        googleSearchPage.enterKeywordInGoogleSearchBox(keyword);
        googleSearchPage.clickGoogleSearchButton();
    }
}
