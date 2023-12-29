package org.ot5usk.steps.wb_steps.elements.catalog.filters;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb_pages.elements.catalog.filters.WbFiltersMenu;
import org.ot5usk.steps.wb_steps.pages.WbCatalogPageSteps;

public class WbFiltersMenuSteps {

    private final WbFiltersMenu filtersMenu;

    public WbFiltersMenuSteps() {
        this.filtersMenu = new WbFiltersMenu();
    }

    @Step("Заполнение фильтра цен")
    public WbFiltersMenuSteps fillPrices(String from, String to) {
        filtersMenu.fillPrices(from, to);
        return this;
    }

    @Step("Выбор фильтра: до 3 дней")
    public WbFiltersMenuSteps clickUpToThreeDays() {
        filtersMenu.clickUpToThreeDays();
        return this;
    }

    @Step("Выбор фильтра: Apple/apple брэнд")
    public WbFiltersMenuSteps clickAppleBrand() {
        filtersMenu.clickAppleBrand();
        return this;
    }

    @Step("Выбор фильтра: 13.6 диагнональ")
    public void clickScreenDiagonal() {
        filtersMenu.clickScreenDiagonal();
    }

    @Step("Нажатие на кнопку применения выбранных фильтров")
    public void clickShowBtn() {
        filtersMenu.clickShowBtn();
        new WbCatalogPageSteps();
    }

    @Step("Поиск кнопки Сбросить")
    public SelenideElement getResetBtn() {
        return filtersMenu.getResetBtn();
    }

    @Step("Поиск количества товаров в меню фильтров")
    public SelenideElement getProductsCounter() {
        return filtersMenu.getProductsCounter();
    }
}
