package org.ot5usk.steps.scripts.wb_scripts;

import org.ot5usk.steps.wb_steps.pages.WbCatalogPageSteps;
import org.ot5usk.steps.wb_steps.pages.WbHomePageSteps;

import static org.ot5usk.steps.wb_scripts_assertions.WbSearchBarScriptAssertions.*;
import static org.ot5usk.steps.wb_scripts_assertions.WbSearchBarScriptAssertions.expectedCardBrand;

public class WbSearchBarScript {

    private static final String query = "Iphone 13";
    private static final String baseRangingFilter = "По популярности";
    private static final String cardBrand = "Apple";

    public void execute() {
        WbCatalogPageSteps catalogPageSteps = new WbHomePageSteps().openHomePage()
                .clickOnTheSearchBar()
                .enterQuery(query)
                .sendEnter();
        expectedSearchBarResultsTitle(query);
        expectedNavBarFilterTitle(query);
        expectedBaseRangingFilterTitle(baseRangingFilter);
        expectedCardBrand(cardBrand);
        catalogPageSteps.clickOnTheSearchBar().clickTheCross();
        checkClickTheCross();
    }
}
