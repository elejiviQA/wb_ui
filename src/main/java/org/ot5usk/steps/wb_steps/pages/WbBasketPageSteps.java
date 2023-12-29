package org.ot5usk.steps.wb_steps.pages;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.pages.wb_pages.WbBasketPage;

public class WbBasketPageSteps {

    private final WbBasketPage basketPage;

    public WbBasketPageSteps() {
        this.basketPage = new WbBasketPage();
    }

    @Step("Поиск названия товара в коризне")
    public SelenideElement getCardName() {
        return basketPage.getCardName();
    }

    @Step("Поиск актуальной цены товара в корзине")
    public SelenideElement getNewCardPrice() {
        return basketPage.getNewCardPrice();
    }

    @Step("Поиск старой цены товара в коризне")
    public SelenideElement getOldCardPrice() {
        return basketPage.getOldCardPrice();
    }

    @Step("Поиск актуальной итоговой цены")
    public SelenideElement getNewTotalPrice() {
        return basketPage.getNewTotalPrice();
    }

    @Step("Поиск старой итоговой цены")
    public SelenideElement getOldTotalPrice() {
        return basketPage.getOldTotalPrice();
    }

    @Step("Поиск кнопки Заказать")
    public SelenideElement getOrderBtn() {
        return basketPage.orderBtn();
    }
}
