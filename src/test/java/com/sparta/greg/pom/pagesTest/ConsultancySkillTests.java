package com.sparta.greg.pom.pagesTest;

import com.sparta.greg.pom.pages.ConsultancySkills;
import com.sparta.greg.pom.pages.Login;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Properties;

public class ConsultancySkillTests {
    WebDriver webDriver = new ChromeDriver();
    ConsultancySkills consultancySkills;

    @Test
    @DisplayName("Going to the consultancy skills page using the URL")
    public void goToConsultancySkillsPage() {
        consultancySkills.goToConsultancySkillsPage();
        webDriver.close();
    }
    @Test
    @DisplayName("Click what these skills make button")
    public void clickWhatTheseSkillsMakeButton() {
        consultancySkills.goToConsultancySkillsPage();
        consultancySkills.clickWhatTheseSkillsMakeButton();
        webDriver.close();
    }

    @Test
    @DisplayName("Click back to profile or dashBoard button on consultancy skills")
    public void clickBackToProfileOrDashBoardButtonOnConsultancySkills() {
        consultancySkills.goToConsultancySkillsPage();
        consultancySkills.clickBackToProfileOrDashBoardButtonOnConsultancySkills();
        webDriver.close();
    }
    @Test
    @DisplayName("Click Studious Button On Consultancy Skills")
    public void clickStudiousButtonOnConsultancySkills() {
        consultancySkills.goToConsultancySkillsPage();
        consultancySkills.clickStudiousButtonOnConsultancySkills();
        webDriver.close();
    }
}
