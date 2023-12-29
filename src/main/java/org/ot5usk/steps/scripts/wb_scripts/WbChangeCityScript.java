package org.ot5usk.steps.scripts.wb_scripts;

import io.qameta.allure.Step;
import org.ot5usk.steps.wb_scripts_assertions.WbChangeCityScriptAssertions;
import org.ot5usk.steps.wb_steps.elements.base.change_city.WbChangeCitySteps;
import org.ot5usk.steps.wb_steps.pages.WbHomePageSteps;

public class WbChangeCityScript {

    public WbChangeCitySteps changeCitySteps;
    private static final String query = "Санкт-Петербург";
    private String firstAddress;
    private String infoBlockAddress;
    private String currentAddress;

    public void execute() {
        changeCitySteps = new WbHomePageSteps().openHomePage().clickChCityBtn().executeQuery(query);
        getFirstAddress();
        changeCitySteps.selectFirstAddress();
        WbChangeCityScriptAssertions chCityAsserts = new WbChangeCityScriptAssertions(this);
        chCityAsserts.checkInfoBlock();
        chCityAsserts.checkInfoBlockAddress();
        changeCitySteps.clickSelectBtn();
        chCityAsserts.checkCurrentUrl();
        chCityAsserts.checkCurrentAddress();
    }

    @Step("Получение первого адреса из результирующего списка")
    public String getFirstAddress() {
        if (firstAddress == null) {
            firstAddress = changeCitySteps.getFirstAddress().getText();
        }
        return firstAddress;
    }

    @Step("Получение адреса из блока информации о центре выдачи")
    public String getInfoBlockAddress() {
        if (infoBlockAddress == null) {
            infoBlockAddress = changeCitySteps.getInfoBlockAddress().getText();
        }
        return infoBlockAddress;
    }

    @Step("Получение текущего адреса доставки")
    public String getCurrentAddress() {
        if (currentAddress == null) {
            currentAddress = changeCitySteps.getCurrentAddress().getText();
        }
        return currentAddress;
    }
}
