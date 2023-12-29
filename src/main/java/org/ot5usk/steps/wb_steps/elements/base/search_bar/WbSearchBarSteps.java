package org.ot5usk.steps.wb_steps.elements.base.search_bar;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb_pages.elements.base.search_bar.WbSearchBar;
import org.ot5usk.steps.wb_steps.pages.WbCatalogPageSteps;

public class WbSearchBarSteps {

    private final WbSearchBar searchBar;

    public WbSearchBarSteps() {
        this.searchBar = new WbSearchBar();
    }

    @Step("Ввод запроса в поисковую строку")
    public WbSearchBarSteps enterQuery(String query) {
        searchBar.enterQuery(query);
        return this;
    }

    @Step("Нажатие Enter в поисковой строке")
    public WbCatalogPageSteps sendEnter() {
        searchBar.sendEnter();
        return new WbCatalogPageSteps();
    }

    @Step("Нажатие на крестик поисковой строки")
    public void clickTheCross() {
        searchBar.clickTheCross();
    }

    @Step("Поиск крестика")
    public SelenideElement getCross() {
        return searchBar.getCross();
    }
}
