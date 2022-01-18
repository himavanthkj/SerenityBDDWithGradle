package tests.bdd.pages;

import net.serenitybdd.core.pages.PageObject;

public class GoogleSearchResultsPage extends PageObject {

    public boolean verifyFirstSearchResult(String keyword) {
        System.out.println("Text is - " + $("//h3[1]").getText());
        return $("//h3[1]").getText().contains(keyword);
    }
}
