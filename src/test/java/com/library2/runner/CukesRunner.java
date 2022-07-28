package com.library2.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {
                    "pretty" ,
                    "html:target/cucumber-report.html",
                    "json:target/cucumber.json",
                    "rerun:target/rerun.txt" ,
                    "me.jvt.cucumber.report.PrettyReports:target/cucumber"
            } ,
            features = "src/test/resources/features" ,
            glue = "com/vyTrack/step_definitions" ,
            dryRun = false ,
            tags = "@us154_01"
               ,
                publish = true
    )

    public class CukesRunner {
    }
