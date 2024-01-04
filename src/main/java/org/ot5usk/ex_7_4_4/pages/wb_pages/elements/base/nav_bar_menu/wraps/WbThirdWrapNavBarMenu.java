package org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base.nav_bar_menu.wraps;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.ex_7_4_4.pages.wb_pages.WbCatalogPage;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class WbThirdWrapNavBarMenu {

    private final SelenideElement vacuumNdSteamCleaners2 = $x("//div[@data-menu-id='16107']//a[text()='Пылесосы и пароочистители']");

    public WbCatalogPage clickVacuumNdSteamCleaners2() {
        vacuumNdSteamCleaners2.shouldBe(appear).click();
        return new WbCatalogPage();
    }
}
