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
            features = "src/test/resources/features" , // from content
            glue = "com/library2/step_definitions" , //from source root

            dryRun = false ,
            tags = "@us001_T01"
               ,
                publish = true
    )

    public class CukesRunner {
    }
