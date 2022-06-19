package pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class AndroidPages {
    SelenideElement pageText = $(AppiumBy.id("org.wikipedia.alpha:id/primaryTextView"));
    SelenideElement secondPage = $(AppiumBy.xpath("//android.widget.HorizontalScrollView[@content-desc=\"Page 1 of 4\"]" +
            "/android.widget.LinearLayout/android.widget.LinearLayout[2]"));
    SelenideElement thirdPage = $(AppiumBy.xpath("//android.widget.HorizontalScrollView[@content-desc=\"Page 2 of 4\"]" +
            "/android.widget.LinearLayout/android.widget.LinearLayout[3]"));
    SelenideElement fourthPage = $(AppiumBy.xpath("//android.widget.HorizontalScrollView[@content-desc=\"Page 3 of 4\"]" +
            "/android.widget.LinearLayout/android.widget.LinearLayout[4]"));


    public void checkTextOnPage(String text){
        pageText.shouldHave(text(text));
    }

    public void clickedToSecondPage(){
        secondPage.click();
    }

    public void clickedToThirdPage(){
        thirdPage.click();
    }

    public void clickedToFourthPage(){
        fourthPage.click();
    }

}
