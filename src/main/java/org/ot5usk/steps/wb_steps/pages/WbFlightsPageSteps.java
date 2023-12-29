package org.ot5usk.steps.wb_steps.pages;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb_pages.WbFlightsPage;

public class WbFlightsPageSteps {

    private final WbFlightsPage flightsPage;

    public WbFlightsPageSteps() {
        this.flightsPage = new WbFlightsPage();
    }

    @Step("Заполнение поля Откуда")
    public WbFlightsPageSteps fillFrom(String from) {
        flightsPage.fillFrom(from);
        return this;
    }

    @Step("Заполнение поля Куда")
    public WbFlightsPageSteps fillTo(String to) {
        flightsPage.fillTo(to);
        return this;
    }

    @Step("Заполнение поля Дата -Туда")
    public WbFlightsPageSteps fillDate() {
        flightsPage.fillDate();
        return this;
    }

    @Step("Выбор количества пассажиров")
    public WbFlightsPageSteps fillPassengers() {
        flightsPage.fillPassengers();
        return this;
    }

    @Step("Выполнение поиска")
    public void clickSearchBtn() {
        flightsPage.clickSearchBtn();
    }
}
