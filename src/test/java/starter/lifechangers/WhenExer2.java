package starter.lifechangers;

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

    // @Test
    @DisplayName("Should be able open  website")
    void ac1test() {
        actor.attemptsTo( NavigatTo.theSearchHomePage());

    }
    // @Test
    @DisplayName("Should be able to open Login page")
    void Login() {
        actor.attemptsTo(
            NavigatTo.theSearchHomePage(),
            EnterData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/my-account/'")),
            EnterData.forminput("tejas.lotlikar@xyzabc.com", By.id("username")),
            EnterData.forminput("12345678", By.id("password")),
            EnterData.CLickELement(By.cssSelector("input[value='Login']")),
            EnterData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/resources/']"))
        );
    }
}