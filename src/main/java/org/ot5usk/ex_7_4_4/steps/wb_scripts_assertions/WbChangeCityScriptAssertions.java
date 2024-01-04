package org.ot5usk.ex_7_4_4.steps.wb_scripts_assertions;

import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.steps.scripts.wb_scripts.WbChangeCityScript;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.webdriver;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WbChangeCityScriptAssertions {

    private final WbChangeCityScript chCityScript;
    public WbChangeCityScriptAssertions(WbChangeCityScript chCityScript) {
        this.chCityScript = chCityScript;
    }

    @Step("Проверка появления информации о центре выдачи")
    public void checkInfoBlock() {
        chCityScript.changeCitySteps.getInfoBlock().shouldBe(appear);
    }

    @Step("Проверка адреса пункта выдачи")
    public void checkInfoBlockAddress() {
        String firstAddress = chCityScript.getFirstAddress();
        String infoBlockAddress = chCityScript.getInfoBlockAddress();
        assertEquals(firstAddress, infoBlockAddress);
    }

    @Step("Проверка перехода на главную страницу")
    public void checkCurrentUrl() {
        String actualUrl = webdriver().driver().getWebDriver().getCurrentUrl();
        assertEquals("https://www.wildberries.ru/", actualUrl);
    }

    @Step("Проверка текущего адреса")
    public void checkCurrentAddress() {
        String infoBlockAddress = chCityScript.getInfoBlockAddress();
        String currentAddress = chCityScript.getCurrentAddress();
        assertEquals(infoBlockAddress, currentAddress);
    }
}
