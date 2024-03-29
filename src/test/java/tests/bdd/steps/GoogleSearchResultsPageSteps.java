package tests.bdd.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import tests.bdd.pages.GoogleSearchResultsPage;

public class GoogleSearchResultsPageSteps {

    static GoogleSearchResultsPage googleSearchResultsPage;

    @Step
    public void googleSearchResultsShouldMatch(String keyword) {
        Assert.assertTrue("The Google Search Results do not match the keyword '" + keyword + "'.", googleSearchResultsPage.verifyFirstSearchResult(keyword));
    }
}
