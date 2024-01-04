package org.ot5usk.ex_7_4_4.steps.wb_steps.elements.catalog.cards;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.catalog.cards.WbCards;

public class WbCardsSteps {

    private final WbCards cards;

    public WbCardsSteps() {
        this.cards = new WbCards();
    }

    @Step("Нажатие кнопки добавления товара в корзину")
    public void clickAddCardInBasketBtn() {
        cards.clickAddCardInBasketBtn();
    }

    @Step("Поиск названия товара")
    public SelenideElement getCardName() {
        return cards.getCardName();
    }

    @Step("Поиск брэнда товара")
    public SelenideElement getCardBrand() {
        return cards.getCardBrand();
    }

    @Step("Поиск актуальной цены продукта")
    public SelenideElement getNewCardPrice() {
        return cards.getNewCardPrice();
    }

    @Step("Поиск старой цены продукта")
    public SelenideElement getOldCardPrice() {
        return cards.getOldCardPrice();
    }
}