package starter.lifechangers;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.targets.SearchableTarget;
import net.serenitybdd.screenplay.ui.Link;
import net.serenitybdd.screenplay.ui.PageElement;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.CastMember;
import net.serenitybdd.screenplay.ui.Button;
import net.serenitybdd.screenplay.ui.Link;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import starter.actions.Forminput.SendData;
import starter.actions.Helpers.Crawler;

import starter.actions.Verifiers.Verifier;
import starter.actions.navigation.NavigateTo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import starter.actions.Forminput.SendData;
import starter.actions.navigation.NavigateTo;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenUserStory3 {

    @CastMember
    Actor actor;

    @Steps
    Crawler website;

    @Steps
    Verifier vr;

    public List<By> getList(String url) {
        switch (url) {
            case "https://lifechangers.org/":
                return List.of(By.className("form-control"), By.className("navbar-brand"));
            case "https://lifechangers.org/about-us/":
            case "https://lifechangers.org/?page_id=154":
            case "https://lifechangers.org/events/":
            case "https://lifechangers.org/category/news/":
            case "https://lifechangers.org/contact/":
                return List.of(By.className("page-header"), By.className("navbar-brand"));
            default:
                return List.of();
        }
    }

    @Test
    @DisplayName("Should be able Open The website")
    void ac1test() {
        actor.attemptsTo(NavigateTo.theSearchHomePage());
        List<String> urls = website.getUrls();
        for (String url : urls) {
            actor.attemptsTo(SendData.CLickELement(By.cssSelector("a[href='" + url + "'")));
        }
    }

    @Test
    void ac2Test() {
        actor.attemptsTo(NavigateTo.theSearchHomePage());
        List<String> urls = website.getUrls();
        for (String url : urls) {
            actor.attemptsTo(SendData.CLickELement(By.cssSelector("a[href='" + url + "'")));
            List<By> arr = getList(url);
            for (By id : arr) {
                vr.verifyIfExists(id, actor);
            }
        }
    }

    @Test
    @DisplayName("Should be able Open The Login and add to cart")
    void Add_to_cart_workflow() {
        actor.attemptsTo(
            NavigateTo.theSearchHomePage(),
            SendData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/my-account/'")),
            SendData.forminput("tejas.lotlikar@xyzabc.com", By.id("username")),
            SendData.forminput("12345678", By.id("password")),
            SendData.CLickELement(By.cssSelector("input[value='Login']")),
            Click.on(Link.containing("resources")),
            Click.on(Button.withText("GO TO RESOURCE")),
            Click.on(Button.withText("add to cart")),
            SendData.CLickELement(By.className("btn-cart"))
        );
    }

//    @Test
//    @DisplayName("Should be able Register")
//    void register() {
//        actor.attemptsTo(
//            NavigatTo.theSearchHomePage(),
//            EnterData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/my-account/'")),
//            EnterData.forminput("tejas.lotlikar@xyzabc.com", By.id("reg_email")),
//            EnterData.forminput("12345678", By.id("reg_password")),
//            EnterData.CLickELement(By.cssSelector("input[value='Register']")),
//            EnterData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/my-account/customer-logout/']")));
//    }

}
