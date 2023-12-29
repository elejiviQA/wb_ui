package org.ot5usk;

import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.ot5usk.steps.scripts.Scripts;

public class ScriptsTest {

    private final Scripts scripts = new Scripts();

    @DisplayName("Работа с поисковой строкой")
    @Description("Проверка результатов: ввода запроса, нажатия крестика")
    @Test
    void testExecuteWbSearchBarScript() {
        scripts.executeWbSearchBarScript();
    }

    @DisplayName("Смена города")
    @Description("Проверка результатов: ввода запроса, выбора адреса")
    @Test
    void testExecuteWbChangeCityScript() {
        scripts.executeWbChangeCityScript();
    }

    @DisplayName("Добавление товара в корзину")
    @Description("Проверка результатов: выбора навигационных фильтров, добавления товара в коризну")
    @Test
    void testExecuteWbBasketScript() {
        scripts.executeWbBasketScript();
    }

    @DisplayName("Работа с фильтрами")
    @Description("Проверка результатов: выбора фильтров")
    @Test
    void testExecuteWbFiltersScript() {
        scripts.executeWbFiltersScript();
    }

    @DisplayName("Поиск авиабилетов")
    @Description("Проверка результатов: поиска авиабилетов")
    @Test
    void testExecuteWbSearchFlightsScript() {
        scripts.executeWbSearchFlightsScript();
    }
}