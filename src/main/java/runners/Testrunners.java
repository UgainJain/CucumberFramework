package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
                  features= {"C:\\Users\\ugainjain\\Documents\\Cucumber\\Ugain_3151433_FrameWork2.0\\src\\main\\java\\features\\ALogin.feature","C:\\Users\\ugainjain\\Documents\\Cucumber\\Ugain_3151433_FrameWork2.0\\src\\main\\java\\features\\FlightFinder.feature","C:\\Users\\ugainjain\\Documents\\Cucumber\\Ugain_3151433_FrameWork2.0\\src\\main\\java\\features\\FlightSelector.Feature","C:\\Users\\ugainjain\\Documents\\Cucumber\\Ugain_3151433_FrameWork2.0\\src\\main\\java\\features\\Flightbooking.feature"}
                 ,glue= {"step_defination"}
                 ,plugin = {"pretty","html:HTML_reports","json:JSON_reports/JasonReports1","junit:JUNIT_Reports/JunitReport1"}
                 ,dryRun = false
                 ,monochrome = true
		)

public class Testrunners {

}
