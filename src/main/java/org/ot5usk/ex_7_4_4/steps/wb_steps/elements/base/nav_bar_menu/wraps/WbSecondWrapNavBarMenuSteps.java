package org.ot5usk.ex_7_4_4.steps.wb_steps.elements.base.nav_bar_menu.wraps;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base.nav_bar_menu.wraps.WbSecondWrapNavBarMenu;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbCatalogPageSteps;

public class WbSecondWrapNavBarMenuSteps {

    private final WbSecondWrapNavBarMenu secondWrapNavBarMenu;

    public WbSecondWrapNavBarMenuSteps() {
        this.secondWrapNavBarMenu = new WbSecondWrapNavBarMenu();
    }

    @Step("Открытие меню: Пылесосы и пароочистители")
    public WbThirdWrapNavBarMenuSteps clickVacuumNdSteamCleaners() {
        secondWrapNavBarMenu.clickVacuumNdSteamCleaners();
        return new WbThirdWrapNavBarMenuSteps();
    }

    public WbCatalogPageSteps clickLaptops() {
        secondWrapNavBarMenu.clickLaptops();
        return new WbCatalogPageSteps();
    }
}
