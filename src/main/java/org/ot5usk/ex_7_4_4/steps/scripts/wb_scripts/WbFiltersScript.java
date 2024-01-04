package org.ot5usk.ex_7_4_4.steps.scripts.wb_scripts;

import org.ot5usk.ex_7_4_4.steps.wb_steps.elements.catalog.filters.WbFiltersMenuSteps;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbHomePageSteps;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbCatalogPageSteps;

import static com.codeborne.selenide.Selenide.sleep;
import static org.ot5usk.ex_7_4_4.steps.wb_scripts_assertions.WbFiltersScriptAssertions.*;

public class WbFiltersScript {

    private WbCatalogPageSteps catalogPageSteps;
    private String navBarCardsCounterBeforeUseFilters;

    public void execute() {
        catalogPageSteps = new WbHomePageSteps().openHomePage()
                .clickNavBarBtn()
                .goToElectronics()
                .clickLaptopsNdComputers()
                .clickLaptops();
        checkOpenedPage();
        rememberNavBarCardsCounter();
        WbFiltersMenuSteps filtersMenuSteps = catalogPageSteps.filtersSteps().openFiltersMenu();
        filtersMenuSteps
                .fillPrices("100000", "149000")
                .clickUpToThreeDays()
                .clickAppleBrand()
                .clickScreenDiagonal();
        sleep(5000);
        String productsCountInFiltersMenu = filtersMenuSteps.getProductsCounter().getText();
        filtersMenuSteps.clickShowBtn();
        checkFiltersActivity(navBarCardsCounterBeforeUseFilters);
        checkProductsCounter(productsCountInFiltersMenu);
        checkDisplayOfFilters();
        checkVisibilityOfResetBtn();
    }

    private void rememberNavBarCardsCounter() {
        if (navBarCardsCounterBeforeUseFilters == null) {
            navBarCardsCounterBeforeUseFilters = catalogPageSteps.getNavBarCardsCounter().getText();
        }
    }
}
