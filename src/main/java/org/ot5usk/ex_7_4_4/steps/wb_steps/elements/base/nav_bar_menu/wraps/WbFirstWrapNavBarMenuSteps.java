package org.ot5usk.ex_7_4_4.steps.wb_steps.elements.base.nav_bar_menu.wraps;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base.nav_bar_menu.wraps.WbFirstWrapNavBarMenu;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbFlightsPageSteps;

public class WbFirstWrapNavBarMenuSteps {

    private final WbFirstWrapNavBarMenu firstWrapNavBarMenu;

    public WbFirstWrapNavBarMenuSteps() {
        firstWrapNavBarMenu = new WbFirstWrapNavBarMenu();
    }

    @Step("Открытие меню: Техника для дома")
    public WbSecondWrapNavBarMenuSteps clickHomeAppliances() {
        firstWrapNavBarMenu.clickHomeAppliances();
        return new WbSecondWrapNavBarMenuSteps();
    }

    public WbSecondWrapNavBarMenuSteps clickLaptopsNdComputers() {
        firstWrapNavBarMenu.clickLaptopsNdComputers();
        return new WbSecondWrapNavBarMenuSteps();
    }

    public WbFlightsPageSteps clickFlights() {
        firstWrapNavBarMenu.clickFlights();
        return new WbFlightsPageSteps();
    }
}
