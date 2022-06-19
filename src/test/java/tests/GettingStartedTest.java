package tests;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.AndroidPages;

import static io.qameta.allure.Allure.step;

public class GettingStartedTest extends TestBase {
    AndroidPages androidPages = new AndroidPages();

    String firstPageText = "The Free Encyclopedia …in over 300 languages";
    String secondPageText = "New ways to explore";
    String thirdPageText = "Reading lists with sync";
    String fourthPageText = "Send anonymous data";

    @DisplayName("Getting Started Page Test")
    @Test
    void gettingStartedPageTest() {
        step("Checking text on first page", () -> {
            androidPages.checkTextOnPage(firstPageText);
        });

        step("Clicked to second page", () -> {
            androidPages.clickedToSecondPage();
        });

        step("Checking text on second page", () -> {
            androidPages.checkTextOnPage(secondPageText);
        });

        step("Clicked to third page", () -> {
            androidPages.clickedToThirdPage();
        });

        step("Checking text on third page", () -> {
            androidPages.checkTextOnPage(thirdPageText);
        });

        step("Clicked to fourth page", () -> {
            androidPages.clickedToFourthPage();
        });

        step("Checking text on fourth page", () -> {
            androidPages.checkTextOnPage(fourthPageText);
        });


    }
}
