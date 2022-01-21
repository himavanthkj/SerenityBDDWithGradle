package tests.bdd.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WithByLocator;
import net.serenitybdd.core.pages.WithLocator;
import org.openqa.selenium.By;

public class GoogleSearchResultsPage extends PageObject {

    public boolean verifyFirstSearchResult(String keyword) {
//        System.out.println("Text is - " + textOf("//h3[1]"));
        return textOf("//h3[1]").contains(keyword);
    }
}
