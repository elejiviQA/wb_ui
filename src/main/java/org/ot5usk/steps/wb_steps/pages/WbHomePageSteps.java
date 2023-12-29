package org.ot5usk.steps.wb_steps.pages;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb_pages.WbHomePage;
import org.ot5usk.steps.wb_steps.elements.base.WbBaseElementsSteps;

public class WbHomePageSteps extends WbBaseElementsSteps {

    private final WbHomePage home;

    public WbHomePageSteps() {
        this.home = new WbHomePage();
    }


    @Step("Открытие домашней страницы")
    public WbHomePageSteps openHomePage() {
        home.open();
        return this;
    }
}
