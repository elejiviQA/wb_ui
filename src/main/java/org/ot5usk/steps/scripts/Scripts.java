package org.ot5usk.steps.scripts;

import com.codeborne.selenide.Configuration;
import org.ot5usk.steps.scripts.wb_scripts.*;

public class Scripts {

    public Scripts() {
        Configuration.timeout = 10000;
        Configuration.browserSize = "1920x1080";
    }

    public void executeWbSearchBarScript() {
        new WbSearchBarScript().execute();
    }

    public void executeWbChangeCityScript() {
        new WbChangeCityScript().execute();
    }

    public void executeWbBasketScript() {
        new WbBasketScript().execute();
    }

    public void executeWbFiltersScript() {
        new WbFiltersScript().execute();
    }

    public void executeWbSearchFlightsScript() {
        new WbSearchFlightsScript().execute();
    }
}
