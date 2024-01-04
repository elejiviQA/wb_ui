package org.ot5usk.ex_7_4_4.steps.wb_scripts_assertions;

import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.steps.wb_steps.elements.catalog.filters.WbFiltersMenuSteps;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbCatalogPageSteps;

import java.util.List;

import static com.codeborne.selenide.Condition.appear;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WbFiltersScriptAssertions {

    private static final WbCatalogPageSteps catalogPageSteps = new WbCatalogPageSteps();
    private static final WbFiltersMenuSteps filtersMenuSteps = new WbFiltersMenuSteps();
    private static final String expectedPageTitle = "Ноутбуки и ультрабуки";
    private static final List<String> expectedFiltersChoice = List.of("до 3 дней", "Apple", "от 100 000 до 149 000", "13.6\"");

    @Step("Проверка заголовка страницы")
    public static void checkOpenedPage() {
        assertEquals(expectedPageTitle, catalogPageSteps.getNavBarTitle().getText());
    }

    @Step("Проверка активации фильтров")
    public static void checkFiltersActivity(String navBarCardsCounterBeforeUseFilters) {
        String before = navBarCardsCounterBeforeUseFilters.replaceAll("[^0-9]", "");
        String after = catalogPageSteps.getNavBarCardsCounter().getText().replaceAll("[^0-9]", "");
        assertTrue(Long.parseLong(after) <= Long.parseLong(before)); // <=, =?
    }

    @Step("Проверка равенства количества товаров в меню фильтров и количества товаров на странице каталога")
    public static void checkProductsCounter(String productsCountInFiltersMenu) {
        assertEquals(productsCountInFiltersMenu.replaceAll("[^0-9]", ""), catalogPageSteps.getNavBarCardsCounter().getText().replaceAll("[^0-9]", ""));
    }

    @Step("Проверка отображения фильтров на странице")
    public static void checkDisplayOfFilters() {
        ElementsCollection choices = catalogPageSteps.filtersSteps().getSelectedFilters();
        for (int i = 0; i < expectedFiltersChoice.size(); i++) {
            assertTrue(choices.get(i).isDisplayed());
            assertEquals(expectedFiltersChoice.get(i).toLowerCase(), choices.get(i).getText().toLowerCase());
        }
    }

    @Step("Проверка появления кнопки Сбросить всё")
    public static void checkVisibilityOfResetBtn() {
        filtersMenuSteps.getResetBtn().shouldBe(appear);
    }
}
