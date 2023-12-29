package org.ot5usk.steps.wb_steps.elements.base.nav_bar_menu;

import io.qameta.allure.Step;
import org.ot5usk.pages.wb_pages.elements.base.nav_bar_menu.WbNavBarMenu;
import org.ot5usk.steps.wb_steps.elements.base.nav_bar_menu.wraps.WbFirstWrapNavBarMenuSteps;

public class WbNavBarMenuSteps {

    private final WbNavBarMenu navBarMenu;

    public WbNavBarMenuSteps() {
        this.navBarMenu = new WbNavBarMenu();
    }

    @Step("Открытие меню: Бытовая техника")
    public WbFirstWrapNavBarMenuSteps goToHouseholdAppliances() {
        navBarMenu.goToHouseholdAppliances();
        return new WbFirstWrapNavBarMenuSteps();
    }

    public WbFirstWrapNavBarMenuSteps goToElectronics() {
        navBarMenu.goToElectronics();
        return new WbFirstWrapNavBarMenuSteps();
    }

    public WbFirstWrapNavBarMenuSteps goToTravels() {
        navBarMenu.goToTravels();
        return new WbFirstWrapNavBarMenuSteps();
    }
}
