package org.ot5usk.ex_7_4_4.steps.wb_steps.elements.base.change_city;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base.change_city.WbChangeCity;

public class WbChangeCitySteps {

    private final WbChangeCity changeCity;

    public WbChangeCitySteps() {
        this.changeCity = new WbChangeCity();
    }

    @Step("Выполнение поискового запроса - поиск города")
    public WbChangeCitySteps executeQuery(String query) {
        changeCity.executeQuery(query);
        return this;
    }

    @Step("Поиск первого адреса из результирующего списка")
    public SelenideElement getFirstAddress() {
        return changeCity.getFirstAddress();
    }

    @Step("Выбор первого адреса из результирующего списка")
    public void selectFirstAddress() {
        changeCity.selectFirstAddress();
    }

    @Step("Поиск адреса из блока информации о центре выдачи")
    public SelenideElement getInfoBlockAddress() {
        return changeCity.getInfoBlockAddress();
    }

    @Step("Поиск блока информации о центре выдачи")
    public SelenideElement getInfoBlock() {
        return changeCity.getInfoBlock();
    }

    @Step("Нажатие кнопки Выбрать")
    public void clickSelectBtn() {
        changeCity.clickSelectBtn();
    }

    @Step("Поиск текущего адреса")
    public SelenideElement getCurrentAddress() {
        return changeCity.getCurrentAddress();
    }
}
