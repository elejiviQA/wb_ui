package org.ot5usk.pages.wb_pages.elements.base.change_city;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class WbChangeCity {

    private final SelenideElement menu = $x("//li[contains(@class, 'simple-menu__item j-geocity-wrap')]");
    private final SelenideElement searchBar = $x("//input[contains(@placeholder, 'Введите адрес')]");
    private final SelenideElement searchBtn = $x("//ymaps[@class='ymaps-2-1-79-searchbox__button-cell']");
    private final SelenideElement searchBarMenu = $x("//ymaps[@class='ymaps-2-1-79-searchbox-list-button']");
    private final SelenideElement firstAddress = $x("//span[contains(@class, 'address-item__name-text')]");
    private final SelenideElement infoBlock = $x("//*[contains(@class, 'geo-block__info-wrap')]");
    private final SelenideElement infoBlockAddress = $x("//*[contains(@class, 'details-self__name-text')]");
    private final SelenideElement selectBtn = $x("//*[contains(@class, 'details-self__btn btn-main')]");
    private final SelenideElement currentAddress = $x("//span[contains(@data-wba-header-name, 'DLV_Adress')]");

    public WbChangeCity clickMenu() {
        menu.click();
        return this;
    }

    public void executeQuery(String query) {
        searchBar.shouldBe(appear).sendKeys(query);
        searchBtn.shouldBe(appear).click();
        searchBarMenu.shouldBe(appear).click();
        searchBar.sendKeys(Keys.ARROW_DOWN, Keys.RETURN);
    }

    public SelenideElement getFirstAddress() {
        return firstAddress;
    }

    public void selectFirstAddress() {
        firstAddress.click();
    }

    public SelenideElement getInfoBlockAddress() {
        return infoBlockAddress;
    }

    public SelenideElement getInfoBlock() {
        return infoBlock;
    }

    public void clickSelectBtn() {
        selectBtn.click();
    }

    public SelenideElement getCurrentAddress() {
        return currentAddress;
    }
}