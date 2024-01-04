package org.ot5usk.ex_7_4_4.pages.wb_pages.elements.catalog.cards;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.*;

public class WbCards {

    private final SelenideElement card = $x("//div[@class='product-card__wrapper']");
    private final SelenideElement addToBasketBtn = $x("//a[contains(@data-link, '/lk/basket')]");
    private final SelenideElement cardName = $x("//article[@data-nm-id][1]//span[@class='product-card__name']");
    private final SelenideElement cardBrand = $x("//article[@data-nm-id][1]//span[@class='product-card__brand']");
    private final SelenideElement newCardPrice = $x("//ins[@class='price__lower-price']");
    private final SelenideElement oldCardPrice = $x("//del");

    public void clickAddCardInBasketBtn() {
        actions().moveToElement(card.shouldBe(appear)).build().perform();
        addToBasketBtn.shouldBe(appear).click();
    }

    public SelenideElement getCardName() {
        return cardName;
    }

    public SelenideElement getCardBrand() {
        return cardBrand;
    }

    public SelenideElement getNewCardPrice() {
        return newCardPrice;
    }

    public SelenideElement getOldCardPrice() {
        return oldCardPrice;
    }
}
