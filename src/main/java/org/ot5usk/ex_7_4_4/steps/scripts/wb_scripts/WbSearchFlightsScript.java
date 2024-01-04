package org.ot5usk.ex_7_4_4.steps.scripts.wb_scripts;

import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbHomePageSteps;
import org.ot5usk.ex_7_4_4.steps.wb_steps.pages.WbFlightsPageSteps;

import static org.ot5usk.ex_7_4_4.steps.wb_scripts_assertions.WbSearchFlightsScriptAssertions.checkOpenedPage;
import static org.ot5usk.ex_7_4_4.steps.wb_scripts_assertions.WbSearchFlightsScriptAssertions.checkTicketsResult;

public class WbSearchFlightsScript {

    public void execute() {
        WbFlightsPageSteps flightsPageSteps = new WbHomePageSteps().openHomePage()
                .clickNavBarBtn()
                .goToTravels()
                .clickFlights();
        checkOpenedPage();
        flightsPageSteps
                .fillFrom("Домодедово")
                .fillTo("Пулково")
                .fillDate()
                .fillPassengers()
                .clickSearchBtn();
        checkTicketsResult();
    }
}
