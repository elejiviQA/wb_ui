package org.ot5usk.pages.wb_pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.LocalDate;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class WbFlightsPage {

    private final static String URL = "https://vmeste.wildberries.ru/avia";
    private final SelenideElement from = $x("//span/input[@id='rc_select_0']");
    private final SelenideElement to = $x("//span/input[@id='rc_select_1']");
    private final SelenideElement date = $x("//div[text()='Туда']");
    private final SelenideElement dateTable = $x("//div[@class='ant-picker-body']//table[@class='ant-picker-content']");
    private final SelenideElement passengers = $x("//div[contains(text(), 'пассажир')]");
    private final SelenideElement searchTicketsBtn = $x("//button[text()='Найти билеты']");
    private final SelenideElement searchResult = $x("//div[@data-module='vmeste-avia-v2']");

    public void fillFrom(String from) {
        this.from.sendKeys(from);
        $x("//div[contains(@label, '" + from + "')]").click();
    }

    public void fillTo(String to) {
        this.to.sendKeys(to);
        $x("//div[contains(@label, '" + to + "')]").click();
    }

    public void fillDate() {
        String desiredDate = String.valueOf(LocalDate.now().plusDays(2).getDayOfMonth());
        date.click();
        ElementsCollection tableDates = dateTable.$$("td[title]");
        for (SelenideElement tableDate : tableDates) {
            if (tableDate.getText().equals(desiredDate)) {
                tableDate.click();
                break;
            }
        }
    }

    public void fillPassengers() {
        passengers.click();
        $$x("//button[@type='button']").get(18).click();
    }

    public void clickSearchBtn() {
        searchTicketsBtn.click();
        searchResult.shouldBe(appear);
    }
}
