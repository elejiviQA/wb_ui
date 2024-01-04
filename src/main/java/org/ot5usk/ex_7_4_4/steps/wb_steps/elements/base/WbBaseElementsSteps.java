package org.ot5usk.ex_7_4_4.steps.wb_steps.elements.base;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base.WbBaseElements;
import org.ot5usk.ex_7_4_4.steps.wb_steps.elements.base.change_city.WbChangeCitySteps;
import org.ot5usk.ex_7_4_4.steps.wb_steps.elements.base.nav_bar_menu.WbNavBarMenuSteps;
import org.ot5usk.ex_7_4_4.steps.wb_steps.elements.base.search_bar.WbSearchBarSteps;

public class WbBaseElementsSteps {

    private final WbBaseElements baseElements;

    public WbBaseElementsSteps() {
        this.baseElements = new WbBaseElements();
    }

    @Step("Нажатие на поисковую строку")
    public WbSearchBarSteps clickOnTheSearchBar() {
        baseElements.clickOnTheSearchBar();
        return new WbSearchBarSteps();
    }

    @Step("Нажатие на кнопку смены города")
    public WbChangeCitySteps clickChCityBtn() {
        baseElements.clickChCityBtn();
        return new WbChangeCitySteps();
    }

    @Step("Нажатие на кнопку открытия меню навигационных фильтров")
    public WbNavBarMenuSteps clickNavBarBtn() {
        baseElements.clickNavBarBtn();
        return new WbNavBarMenuSteps();
    }
}