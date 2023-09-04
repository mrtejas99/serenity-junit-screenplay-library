package starter.lifechangers;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import starter.actions.Forminput.SendData;
import starter.actions.navigation.NavigateTo;

@ExtendWith(SerenityJUnit5Extension.class)
class WhenUserStory2 {

//    @CastMember
//    Actor actor;
//
//    @Test
//    @DisplayName("Should be able open  website")
//    void ac1test() {
//        actor.attemptsTo( NavigateTo.theSearchHomePage());
//
//    }
//    @Test
//    @DisplayName("Should be able to open Login page")
//    void Login() {
//        actor.attemptsTo(
//            NavigateTo.theSearchHomePage(),
//            SendData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/my-account/'")),
//            SendData.forminput("tejas.lotlikar@xyzabc.com", By.id("username")),
//            SendData.forminput("12345678", By.id("password")),
//            SendData.CLickELement(By.cssSelector("input[value='Login']")),
//            SendData.CLickELement(By.cssSelector("a[href='https://lifechangers.org/resources/']"))
//        );
//    }
}