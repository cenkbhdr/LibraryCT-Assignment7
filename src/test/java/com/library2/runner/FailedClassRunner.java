package com.library2.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "@target/rerun.txt",
            glue="com/libray2/step_definitions"

    )


public class FailedClassRunner {
}
