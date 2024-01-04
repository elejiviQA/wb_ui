package org.ot5usk.ex_7_4_4.pages.wb_pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.ot5usk.ex_7_4_4.pages.wb_pages.elements.base.WbBaseElements;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Selenide.$x;

public class WbHomePage extends WbBaseElements {

    private final static String URL = "https://www.wildberries.ru/";
    private final SelenideElement mainPage = $x("//div[contains(@class, 'main-page')]");

    public void open() {
        Selenide.open(URL);
        mainPage.shouldBe(appear);
    }
}
