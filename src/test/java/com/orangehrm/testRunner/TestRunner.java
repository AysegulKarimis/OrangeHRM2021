package com.orangehrm.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
    @RunWith(Cucumber.class)
    @CucumberOptions(

            // This creates cucumber reports
            // pretty butun stepleri gossterecek. consolu yani
            // plugin is fot reports
            plugin = {"pretty", "html:target/site/cucumber-pretty.html", "json:target/cucumber-html-reports/cucumber.json", "junit:target/cucumber-xml-reports/cucumber.xml"},
            //This create auto method name in camelCase

            // repotu nasil gormek istiyorsan onu yaziyorsun UNDER_SCORE da yazabilirisin.
            snippets = CucumberOptions.SnippetType.CAMELCASE,
            monochrome = true,
            // like headless . Checking if the steps are defined or not
            dryRun = false,
            //Path to your feature file   // copy pathten aliyorum bu adresleri path from content root.
            features = {"src/test/resources/features"},
            // Specify tags to be executed
            tags = "@login",
            //Specify step definition package name (Note: make sure to have this package on current directory)
            //Specify step definition package path to connect with feature file
            glue = {"com/orangehrm"}

    )

    public class TestRunner {
    }


