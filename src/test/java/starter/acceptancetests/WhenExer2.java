package starter.acceptancetests;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import starter.actions.Forminput.EnterData;
import starter.actions.navigation.NavigatTo;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenExer2 {

    @CastMember
    Actor actor;

    // // @Test
    @DisplayName("Should be able Open The website")
    void ac1test() {
        actor.attemptsTo(
                NavigatTo.theSearchHomePage());

    }

    // @Test
    @DisplayName("Should be able Open The Login")
    void Login() {
        actor.attemptsTo(
                NavigatTo.theSearchHomePage(),

                EnterData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/my-account/'")),
                EnterData.forminput("pehohi7311@poverts.com", By.id("username")),
                EnterData.forminput("pehohi7311@poverts.com@10", By.id("password")),
                //
                // Evaluate.javascript("logIn()")
                EnterData.CLickELement(By.cssSelector("input[value='Login']")),
                EnterData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/resources/']"))

        // Find(By.id("nameofuser"))
        // Click.on(Button.withText("logout"))
        // Click.on(By.cssSelector("css=button[value='Login in'"))
        );

    }

    // @Test
    // @DisplayName("Should be able Register")
    // void register(){
    // actor.attemptsTo(
    // NavigatTo.theSearchHomePage(),
    // EnterData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/my-account/'")),
    // EnterData.forminput("rjk24322@poverts.com",By.id("reg_email")),
    // EnterData.forminput("rjk24322@",By.id("reg_password")),
    // EnterData.CLickELement(By.cssSelector("input[value='Register']")),
    // EnterData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/my-account/customer-logout/']"))
    // );
    // }

}