package org.ot5usk.ex_7_4_4.steps.scripts.wb_scripts;

import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbHomePageSteps;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbCatalogPageSteps;

import static org.ot5usk.ex_7_4_4.steps.wb_scripts_assertions.WbSearchBarScriptAssertions.*;
import static org.ot5usk.ex_7_4_4.steps.wb_scripts_assertions.WbSearchBarScriptAssertions.expectedCardBrand;

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
