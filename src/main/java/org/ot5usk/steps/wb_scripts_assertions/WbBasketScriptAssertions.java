package org.ot5usk.steps.wb_scripts_assertions;

import io.qameta.allure.Step;
import org.ot5usk.steps.wb_steps.pages.WbBasketPageSteps;
import org.ot5usk.steps.wb_steps.pages.WbCatalogPageSteps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.codeborne.selenide.Condition.text;
import static org.junit.jupiter.api.Assertions.*;

public class WbBasketScriptAssertions {

    private static final WbCatalogPageSteps catalogPageSteps = new WbCatalogPageSteps();
    private static final WbBasketPageSteps basketPageSteps = new WbBasketPageSteps();
    private static final String expectedNavBarTitle = "Пылесосы и пароочистители";
    private static final String[] expectedNavBarPath = {"Главная", "Бытовая техника", "Техника для дома", "Пылесосы и пароочистители"};
    private static final String expectedCounterOfCardsInBasketValue = "1";
    private static final String expectedCounterOfCardsInBasketColor = "rgba(245, 81, 35, 1)";

    @Step("Проверка результирующего заголовка")
    public static void checkNavBarTitle() {
        assertEquals(expectedNavBarTitle, catalogPageSteps.getNavBarTitle().getText());
    }

    @Step("Проверка пути навигационных фильтров")
    public static void checkNavBarPath() {
        String[] currentNavBarPathArr = catalogPageSteps.getNavBarPath().getText().split("\n");
        assertEquals(expectedNavBarPath.length, currentNavBarPathArr.length);
        assertTrue(Arrays.toString(currentNavBarPathArr).contains(Arrays.toString(expectedNavBarPath)));
    }

    @Step("Проверка значения счетчика количества товаров в корзине")
    public static void checkCounterOfCardsInBasketValue() {
        assertEquals(expectedCounterOfCardsInBasketValue, catalogPageSteps.getCounterOfCardsInBasket().getText());

    }

    @Step("Проверка цвета счетчика количества товаров в корзине")
    public static void checkCounterOfCardsInBasketColor() {
        assertEquals(expectedCounterOfCardsInBasketColor, catalogPageSteps.getCounterOfCardsInBasket().getCssValue("background-color"));
    }

    @Step("Проверка имени и брэнда товара в коризине")
    public static void checkCardTextInBasket(String catalogCardName, String catalogCardBrand) {
        List<String> cardInCatalog = List.of(catalogCardName, catalogCardBrand);
        List<String> result = new ArrayList<>();
        for (String s : cardInCatalog) {
            List<String> temp = Arrays.stream(s.split(" ")).toList();
            temp = temp.stream().map(e -> e.replaceAll("[^A-Za-zА-Яа-я0-9]", "")).toList();
            temp = temp.stream().filter(e -> !e.isEmpty()).toList();
            result.addAll(temp);
        }
        for (String s : result) {
            assertTrue(basketPageSteps.getCardName().getText().contains(s));
        }
    }

    @Step("Проверка актуальной цены товара в коризне")
    public static void checkNewCardPriceInBasket(String newCardPriceInCatalog) {
        basketPageSteps.getNewCardPrice().shouldHave(text(newCardPriceInCatalog));
    }

    @Step("Проверка старой цены товара в коризне")
    public static void checkOldCardPriceInBasket(String oldCardPriceInCatalog) {
        basketPageSteps.getOldCardPrice().shouldHave(text(oldCardPriceInCatalog));
    }

    @Step("Проверка актуальной итоговой цены в коризне")
    public static void checkNewTotalPriceInBasket(String newCardPriceInCatalog) {
        basketPageSteps.getNewTotalPrice().shouldHave(text(newCardPriceInCatalog));
    }

    @Step("Проверка старой итоговой цены в коризне")
    public static void checkOldTotalPriceInBasket(String oldCardPriceInCatalog) {
        basketPageSteps.getOldTotalPrice().shouldHave(text(oldCardPriceInCatalog));
    }

    @Step("Проверка кнопки Заказать")
    public static void checkOrderBtnInBasket() {
        assertTrue(basketPageSteps.getOrderBtn().isDisplayed());
        assertTrue(basketPageSteps.getOrderBtn().isEnabled());
    }
}
