package com.orangehrmlive.runners;

import com.orangehrmlive.enums.Routes;
import com.orangehrmlive.utils.exceldata.BeforeSuite;
import com.orangehrmlive.utils.exceldata.DataToFeature;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(CustomRunner.class)
@CucumberOptions(
        snippets = SnippetType.CAMELCASE,
        features = "src/test/resources/features/recruitment.feature",
        glue     = {"com.orangehrmlive.stepsdefinitions","com.orangehrmlive.setups"},
        tags     = "@Recruitment"
)

public class RecruitmentRunner {

    @BeforeSuite
    public static void test() throws InvalidFormatException, IOException {
        DataToFeature.overrideFeatureFiles(Routes.RECRUITMENT_FEATURE.getConstant());
    }
}
