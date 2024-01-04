package org.ot5usk.ex_7_4_4.steps.wb_scripts_assertions;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbCatalogPageSteps;

import static org.junit.jupiter.api.Assertions.*;

public class WbSearchBarScriptAssertions {

    private static final WbCatalogPageSteps catalogSteps = new WbCatalogPageSteps();

    @Step("Проверка результирующего заголовка")
    public static void expectedSearchBarResultsTitle(String expectedResultsTitle) {
        assertEquals(expectedResultsTitle, catalogSteps.getSearchBarResultsTitle().getText());
    }

    @Step("Проверка первого фильтра - фильтра навигации")
    public static void expectedNavBarFilterTitle(String expectedFilterTitle) {
        assertEquals(expectedFilterTitle, catalogSteps.filtersSteps().navBarFilterBtn().getText());
    }

    @Step("Проверка второго фильтра - базового фильтра упорядочивания")
    public static void expectedBaseRangingFilterTitle(String expectedFilterTitle) {
        assertEquals(expectedFilterTitle, catalogSteps.filtersSteps().baseRangingFilterBtn().getText());
    }

    @Step("Проверка брэнда продукта")
    public static void expectedCardBrand(String expectedCardBrand) {
        assertEquals(expectedCardBrand, catalogSteps.cardsSteps().getCardBrand().getText());
    }

    @Step("Проверка отсутствия крестика")
    public static void checkClickTheCross() {
        assertFalse(catalogSteps.clickOnTheSearchBar().getCross().isDisplayed());
    }
}