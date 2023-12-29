package org.ot5usk.steps.scripts.wb_scripts;

import org.ot5usk.steps.wb_steps.pages.WbFlightsPageSteps;
import org.ot5usk.steps.wb_steps.pages.WbHomePageSteps;

import static org.ot5usk.steps.wb_scripts_assertions.WbSearchFlightsScriptAssertions.checkOpenedPage;
import static org.ot5usk.steps.wb_scripts_assertions.WbSearchFlightsScriptAssertions.checkTicketsResult;

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
