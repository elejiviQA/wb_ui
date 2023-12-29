package org.ot5usk.steps.wb_scripts_assertions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Step;
import org.opentest4j.AssertionFailedError;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.*;

public class WbSearchFlightsScriptAssertions {

    @Step("Проверка открытой страницы")
    public static void checkOpenedPage() {
        assertEquals("https://vmeste.wildberries.ru/avia", Selenide.webdriver().driver().getWebDriver().getCurrentUrl());
    }

    @Step("Проверка результатов поиска")
    public static void checkTicketsResult() {
        try {
            int ticketList = $$("div[class*='tickets-module__list']").size();
            assertTrue(ticketList != 0);
        } catch (AssertionFailedError e) {
            Configuration.timeout = 240000;
            $x("//h1[text()='Мы не нашли билеты по вашему запросу']").shouldBe(visible);
        }
    }
}
