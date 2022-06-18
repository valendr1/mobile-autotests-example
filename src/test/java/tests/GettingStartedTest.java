package tests;

import io.appium.java_client.AppiumBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;

public class GettingStartedTest extends TestBase {
    @DisplayName("Getting Started Page Test")
    @Test
    void gettingStartedPageTest() {
//        back();
        step("Checking text on first page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Clicked to second page", () -> {
            $(AppiumBy.xpath("//android.widget.HorizontalScrollView[@content-desc=\"Page 1 of 4\"]" +
                    "/android.widget.LinearLayout/android.widget.LinearLayout[2]"))
                    .click();
        });

        step("Checking text on second page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("New ways to explore"));
        });

        step("Clicked to third page", () -> {
            $(AppiumBy.xpath("//android.widget.HorizontalScrollView[@content-desc=\"Page 2 of 4\"]" +
                    "/android.widget.LinearLayout/android.widget.LinearLayout[3]"))
                    .click();
        });

        step("Checking text on third page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Reading lists with sync"));
        });

        step("Clicked to fourth page", () -> {
            $(AppiumBy.xpath("//android.widget.HorizontalScrollView[@content-desc=\"Page 3 of 4\"]" +
                    "/android.widget.LinearLayout/android.widget.LinearLayout[4]"))
                    .click();
        });

        step("Checking text on fourth page", () -> {
            $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Send anonymous data"));
        });


    }
}
