package org.ot5usk.ex_7_4_4.steps.scripts.wb_scripts;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbHomePageSteps;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbCatalogPageSteps;

import static org.ot5usk.ex_7_4_4.steps.wb_scripts_assertions.WbBasketScriptAssertions.*;

public class WbBasketScript {

    private WbCatalogPageSteps catalogPageSteps;
    private String cardNameInCatalog;
    private String cardBrandInCatalog;
    private String newCardPriceInCatalog;
    private String oldCardPriceInCatalog;

    public void execute() {
        catalogPageSteps = new WbHomePageSteps().openHomePage()
                .clickNavBarBtn()
                .goToHouseholdAppliances()
                .clickHomeAppliances()
                .clickVacuumNdSteamCleaners()
                .clickVacuumNdSteamCleaners2();
        checkNavBarTitle();
        checkNavBarPath();
        rememberCatalogCard();
        catalogPageSteps.cardsSteps().clickAddCardInBasketBtn();
        checkCounterOfCardsInBasketValue();
        checkCounterOfCardsInBasketColor();
        catalogPageSteps.clickGoToBasketBtn();
        checkCardTextInBasket(cardNameInCatalog, cardBrandInCatalog);
        checkNewCardPriceInBasket(newCardPriceInCatalog);
        checkOldCardPriceInBasket(oldCardPriceInCatalog);
        checkNewTotalPriceInBasket(newCardPriceInCatalog);
        checkOldTotalPriceInBasket(oldCardPriceInCatalog);
        checkOrderBtnInBasket();
    }


    @Step("Запомнить товар каталога")
    private void rememberCatalogCard() {
        cardNameInCatalog();
        cardBrandInCatalog();
        newCardPriceInCatalog();
        oldCardPriceInCatalog();
    }

    @Step("Получение названия товара в каталоге")
    private void cardNameInCatalog() {
        if (cardNameInCatalog == null) {
            cardNameInCatalog = catalogPageSteps.cardsSteps().getCardName().getText();
        }
    }

    @Step("Получение брэнда товара в каталоге")
    private void cardBrandInCatalog() {
        if (cardBrandInCatalog == null) {
            cardBrandInCatalog = catalogPageSteps.cardsSteps().getCardBrand().getText();
        }
    }

    @Step("Получение новой цены товара в каталоге")
    private void newCardPriceInCatalog() {
        if (newCardPriceInCatalog == null) {
            newCardPriceInCatalog = catalogPageSteps.cardsSteps().getNewCardPrice().getText();
        }
    }

    @Step("Получение старой цены товара в каталоге")
    private void oldCardPriceInCatalog() {
        if (oldCardPriceInCatalog == null) {
            oldCardPriceInCatalog = catalogPageSteps.cardsSteps().getOldCardPrice().getText();
        }
    }
}
