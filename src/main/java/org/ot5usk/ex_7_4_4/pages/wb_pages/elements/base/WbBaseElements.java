package org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base;

import com.codeborne.selenide.SelenideElement;
import org.ot5usk.ex_7_4_4.pages.wb_pages.WbBasketPage;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base.change_city.WbChangeCity;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base.nav_bar_menu.WbNavBarMenu;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base.search_bar.WbSearchBar;

import static com.codeborne.selenide.Selenide.$x;

public class WbBaseElements {

    private final WbChangeCity changeCity;
    private final WbSearchBar searchBar;
    private final SelenideElement navBarMenuBtn = $x("//button[contains(@aria-label, 'Навигация по сайту')]");
    private final SelenideElement counterOfCardsInBasket = $x("//span[@class='navbar-pc__notify']");
    private final SelenideElement goToBasketBtn = $x("//span[@class='navbar-pc__icon navbar-pc__icon--basket']");

    public WbBaseElements() {
        this.changeCity = new WbChangeCity();
        this.searchBar = new WbSearchBar();
    }

    public WbChangeCity clickChCityBtn() {
        return changeCity.clickMenu();
    }

    public WbSearchBar clickOnTheSearchBar() {
        return searchBar.click();
    }

    public WbNavBarMenu clickNavBarBtn() {
        navBarMenuBtn.click();
        return new WbNavBarMenu();
    }

    public SelenideElement getCounterOfCardsInBasket() {
        return counterOfCardsInBasket;
    }

    public WbBasketPage clickGoToBasketBtn() {
        goToBasketBtn.click();
        return new WbBasketPage();
    }
}
