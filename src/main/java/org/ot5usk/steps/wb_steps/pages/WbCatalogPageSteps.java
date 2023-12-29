package org.ot5usk.steps.wb_steps.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb_pages.WbCatalogPage;
import org.ot5usk.steps.wb_steps.elements.base.WbBaseElementsSteps;
import org.ot5usk.steps.wb_steps.elements.catalog.cards.WbCardsSteps;
import org.ot5usk.steps.wb_steps.elements.catalog.filters.WbFiltersSteps;

public class WbCatalogPageSteps extends WbBaseElementsSteps {

    private final WbCatalogPage catalog;
    private final WbFiltersSteps filtersSteps;
    private final WbCardsSteps cardsSteps;

    public WbCatalogPageSteps() {
        this.catalog = new WbCatalogPage();
        this.filtersSteps = new WbFiltersSteps();
        this.cardsSteps = new WbCardsSteps();
    }

    public WbFiltersSteps filtersSteps() {
        return filtersSteps;
    }

    public WbCardsSteps cardsSteps() {
        return cardsSteps;
    }

    @Step("Поиск результирующего заголовка")
    public SelenideElement getSearchBarResultsTitle() {
        return catalog.getSearchBarResultsTitle();
    }

    @Step("Поиск отображаемого пути навигационных фильтров")
    public SelenideElement getNavBarPath() {
        return catalog.getNavBarPath();
    }

    @Step("Поиск результирующего заголовка навигационных фильтров")
    public SelenideElement getNavBarTitle() {
        return catalog.getNavBarTitle();
    }

    @Step("Поиск отображаемого счетчика количества товаров в каталоге")
    public SelenideElement getNavBarCardsCounter() {
        return catalog.getNavBarCardsCounter();
    }

    @Step("Поиск отображаемого счетчика количества товаров в корзине")
    public SelenideElement getCounterOfCardsInBasket() {
        return catalog.getCounterOfCardsInBasket();
    }

    @Step("Нажатие кнопки перехода в Коризну")
    public void clickGoToBasketBtn() {
        catalog.clickGoToBasketBtn();
        new WbBasketPageSteps();
    }

}
