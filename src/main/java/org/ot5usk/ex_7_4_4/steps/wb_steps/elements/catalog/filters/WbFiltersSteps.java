package org.ot5usk.ex_7_4_4.steps.wb_steps.elements.catalog.filters;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.catalog.filters.WbFilters;

public class WbFiltersSteps {

    private final WbFilters filters;

    public WbFiltersSteps() {
        this.filters = new WbFilters();
    }

    @Step("Поиск выбранных фильтров")
    public ElementsCollection getSelectedFilters() {
        return filters.getSelectedFilters();
    }

    @Step("Открыть меню фильтров")
    public WbFiltersMenuSteps openFiltersMenu() {
        filters.openAllFiltersMenu();
        return new WbFiltersMenuSteps();
    }

    @Step("Поиск навигационного фильтра")
    public SelenideElement navBarFilterBtn() {
        return filters.getNavBarFilterBtn();
    }

    @Step("Поиск базового фильтра ранжирования")
    public SelenideElement baseRangingFilterBtn() {
        return filters.getBaseRangingFilterBtn();
    }
}
