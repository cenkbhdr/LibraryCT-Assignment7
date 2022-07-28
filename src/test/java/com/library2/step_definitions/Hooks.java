package com.library2.step_definitions;

public class Hooks {

    /** Use it before from io.cucumber and not from io.junit
     * It's running BEFORE each scenario */
    @Before
    public void setUpScenario(){
        System.out.println("--> It is coming from @Before in Hooks class");
    }



    /** Use it before from io.cucumber and not from io.junit
     * It's running AFTER each scenario */
    @After
    public void tearDownScenario(Scenario scenario){
        System.out.println("==> It is coming from @After in Hooks class");

        if (scenario.isFailed()) {
            byte[] screenshot =
                    ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.attach(screenshot, "image/png", scenario.getName());
        }


        Driver.closeDriver();
    }


}
